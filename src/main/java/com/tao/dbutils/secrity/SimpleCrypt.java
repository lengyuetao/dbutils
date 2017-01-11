package com.tao.dbutils.secrity;

public class SimpleCrypt {
	 public SimpleCrypt()
	    {
	    }

	    public static char[] encodeByte(byte data[])
	    {
	        char out[] = new char[((data.length + 2) / 3) * 4];
	        int i = 0;
	        for(int index = 0; i < data.length; index += 4)
	        {
	            boolean quad = false;
	            boolean trip = false;
	            int val = 255 & data[i];
	            val <<= 8;
	            if(i + 1 < data.length)
	            {
	                val |= 255 & data[i + 1];
	                trip = true;
	            }
	            val <<= 8;
	            if(i + 2 < data.length)
	            {
	                val |= 255 & data[i + 2];
	                quad = true;
	            }
	            out[index + 3] = alphabet[quad ? val & 63 : 64];
	            val >>= 6;
	            out[index + 2] = alphabet[trip ? val & 63 : 64];
	            val >>= 6;
	            out[index + 1] = alphabet[val & 63];
	            val >>= 6;
	            out[index + 0] = alphabet[val & 63];
	            i += 3;
	        }

	        return out;
	    }

	    public static byte[] decodeByte(String msg)
	    {
	        char swap[] = new char[msg.length()];
	        msg.getChars(0, msg.length(), swap, 0);
	        return decodeByte(swap);
	    }

	    public static byte[] decodeByte(char data[])
	    {
	        int len = ((data.length + 3) / 4) * 3;
	        if(data.length > 0 && data[data.length - 1] == '=')
	            len--;
	        if(data.length > 1 && data[data.length - 2] == '=')
	            len--;
	        byte out[] = new byte[len];
	        int shift = 0;
	        int accum = 0;
	        int index = 0;
	        for(int ix = 0; ix < data.length; ix++)
	        {
	            int value = codes[data[ix] & 255];
	            if(value >= 0)
	            {
	                accum <<= 6;
	                shift += 6;
	                accum |= value;
	                if(shift >= 8)
	                {
	                    shift -= 8;
	                    out[index++] = (byte)(accum >> shift & 255);
	                }
	            }
	        }

	        return out;
	    }

	    public static String encodeString(String msg)
	    {
	        byte swap[] = msg.getBytes();
	        String str = new String(encodeByte(swap));
	        return str;
	    }

	    public static String decodeString(String msg)
	    {
	        char swap[] = new char[msg.length()];
	        msg.getChars(0, msg.length(), swap, 0);
	        String str = new String(decodeByte(swap));
	        return str;
	    }

	  

	    private static byte codes[];
	    private static char alphabet[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();

	    static 
	    {
	        codes = new byte[256];
	        for(int i = 0; i < 256; i++)
	            codes[i] = -1;

	        for(int i = 65; i <= 90; i++)
	            codes[i] = (byte)(i - 65);

	        for(int i = 97; i <= 122; i++)
	            codes[i] = (byte)((26 + i) - 97);

	        for(int i = 48; i <= 57; i++)
	            codes[i] = (byte)((52 + i) - 48);

	        codes[43] = 62;
	        codes[47] = 63;
	    }
}

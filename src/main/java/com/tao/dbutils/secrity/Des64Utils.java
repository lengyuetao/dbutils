package com.tao.dbutils.secrity;

public class Des64Utils {
	public static String des64(String data, String key, String iv)
    {
        try
        {
            DesSecurity des = new DesSecurity(key, iv);
            return des.encrypt64(data.getBytes("utf-8"));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static String unDes64(String data, String key, String iv)
    {
        byte b[] = null;
        DesSecurity des;
		try {
			des = new DesSecurity(key, iv);
			 b = des.decrypt64(data);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
       
        if(b == null)
            return null;
        try
        {
            return new String(b, "utf-8");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}

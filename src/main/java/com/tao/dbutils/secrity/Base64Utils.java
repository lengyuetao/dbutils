package com.tao.dbutils.secrity;

public class Base64Utils {
	public static String base64(String str) {
		return SimpleCrypt.encodeString(str);
	}

	public static String unBase64(String str) {
		return SimpleCrypt.decodeString(str);
	}
}

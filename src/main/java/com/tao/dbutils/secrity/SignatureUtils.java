package com.tao.dbutils.secrity;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.log4j.Logger;

import com.tao.dbutils.enums.Algorithm;



/**
 * 签名算法，包括32位的md5和40位的sha-1
 * 
 * @author penn
 *
 */
public class SignatureUtils {

	private static Logger logger = Logger.getLogger("HttpUtils");
	/**
	 * 不加加密盐
	 */
	public static String NO_SALT = "";
	/**
	 * 使用默认加密盐
	 */
	public static String DEFAULT_SALT = null;

	private MessageDigest messageDigest;
	private Algorithm defaulAlgorithm = Algorithm.MD5;
	private String salt;

	/**
	 * 默认使用MD5算法
	 */
	public SignatureUtils() {// 默认使用MD5算法
		try {
			messageDigest = MessageDigest.getInstance(defaulAlgorithm.toString());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			logger.error("实例化时参数[" + defaulAlgorithm + "]错误");
		}
	}

	/**
	 * 使用参数指定的算法
	 * 
	 * @param algorithm
	 *            算法名称
	 */
	public SignatureUtils(Algorithm algorithm) {
		try {
			messageDigest = MessageDigest.getInstance(algorithm.toString());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			logger.error("实例化时参数[" + algorithm + "]错误");
		}
	}

	/**
	 * 加密方法。
	 * 如果salt == null，	默认的盐加密。 
	 * 如果salt.equals("")，	不带盐加密
	 * 
	 * @param plaintext
	 *            明文
	 * @param salt
	 *            盐
	 * @return 密文
	 */
	public String encrypt(String plaintext, String salt) {
		if (salt == null) {
			this.salt = "penn";
		} else {
			this.salt = salt;
		}
		String finaltext = plaintext + this.salt;
		messageDigest.update(finaltext.getBytes());
		byte[] buffer = messageDigest.digest();
		StringBuffer sb = new StringBuffer(buffer.length * 2);
		for (int i = 0; i < buffer.length; i++) {
			sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));
			sb.append(Character.forDigit(buffer[i] & 15, 16));
		}
		return sb.toString();
	}
	
	
	/**
	 * 加密方法。
	 * 如果salt == null，	默认的盐加密。 
	 * 如果salt.equals("")，	不带盐加密
	 * 
	 * @param plaintext
	 *            明文
	 * @param salt
	 *            盐
	 * @return 密文
	 * @throws UnsupportedEncodingException 
	 */
	public String encryptEx(String plaintext, String charset) {
		String finaltext = plaintext;
		StringBuffer sb = null;
		try{
			if (charset == null || "".equals(charset))
				messageDigest.update(finaltext.getBytes());
			else
				messageDigest.update(finaltext.getBytes(charset));
			
			byte[] buffer = messageDigest.digest();
			sb = new StringBuffer(buffer.length * 2);
			for (int i = 0; i < buffer.length; i++) {
				sb.append(Character.forDigit((buffer[i] & 240) >> 4, 16));
				sb.append(Character.forDigit(buffer[i] & 15, 16));
			}
		}catch(Exception ex){
			
		}
		return sb.toString().toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println(new SignatureUtils().encryptEx("domainId=99&netBarId=2749&nonceStr=7d14eff3728b18e4a7aa0589129d81c3&timeStamp=1446024574018&key=sdlkjsdljf0j2fsjk","utf-8"));
	}
}

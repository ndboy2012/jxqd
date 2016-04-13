package com.antox.RSA;


import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;

import javax.crypto.Cipher;

import org.bouncycastle.util.encoders.Hex;

import com.antox.utils.HexUtils;

/**
 * RSA 算法 js加密 后台加密 js加密时使用的公钥字符串
 * <p>
 * <b>注意：</b> 生成的密钥对的值与 种子（seedKey）、虚拟机实现等都有关系，不同的机器生成的密钥值可能不同。
 * 在实际测试时发现，同样的环境，有些机器每次生成的密钥值也不同，比如每次重启服务器后值不同。 所以在实际生产环境中使用时，该值需要通过服务器端输出到客户端。
 * 如果有多台服务器，可能每台服务器的值不同，所以需要有类似F5的策略，保证多次请求路由到一台服务器上。
 * 
 * @author 66
 */
public class RSA {
	static {
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
	}

	/** 可以先注册到虚拟机中,再通过名称使用;也可以不注册,直接传入使用 */
	/**
	 * 获取公钥对时的名称
	 * 
	 * */
	private final static String AlogrithmName = "RSA";
	/**
	 * 加密或解密使用的算法和属性
	 */
	private final static String EncryptName = "RSA/ECB/PKCS1Padding";

	private final static String ProviderName = "BC";

	/** 种子,改变后,生成的密钥对会发生变化 */
	private static String seedKey = "random";

	private static String charSet = "UTF-8";

	/**
	 * 生成密钥对
	 * 
	 * @author 66
	 * @throws Exception
	 */
	public static KeyPair generateKeyPair() throws Exception {
		KeyPairGenerator kpg = KeyPairGenerator.getInstance(AlogrithmName, ProviderName);
		kpg.initialize(1024, new SecureRandom(seedKey.getBytes()));

		// KeyPairGenerator kpg = KeyPairGenerator.getInstance(AlogrithmName,
		// ProviderName);
		// kpg.initialize(1024);
		KeyPair kp = kpg.generateKeyPair();
		return kp;
	}

	public static KeyPair fromString(String puk, String prk) throws Exception {
		KeyPairGenerator kpg = KeyPairGenerator.getInstance(AlogrithmName, ProviderName);
		kpg.initialize(1024, new SecureRandom(seedKey.getBytes()));

		// KeyPairGenerator kpg = KeyPairGenerator.getInstance(AlogrithmName,
		// ProviderName);
		// kpg.initialize(1024);
		KeyPair kp = kpg.generateKeyPair();
		return kp;
	}

	/**
	 * 加密
	 * 
	 * @author 66
	 * @param input
	 *            加密数据
	 * @param publicKey
	 *            公钥
	 * @return
	 * @throws Exception
	 */
	public static byte[] encrypt(String input, PublicKey publicKey) throws Exception {
		Cipher cipher = Cipher.getInstance(EncryptName, ProviderName);
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] re = cipher.doFinal(input.getBytes(charSet));
		return re;
	}
	
	/**
	 * 获取解密后的字符串
	 * 
	 * @author 66
	 * @param encrypt
	 * @param privateKey
	 *            私钥
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String encrypt, PrivateKey privateKey) throws Exception {
		byte[] input = Hex.decode(encrypt);
		byte[] raw = decrypt(input, privateKey);
		// 标志位为0之后的是输入的有效字节
		int i = raw.length - 1;
		while (i > 0 && raw[i] != 0) {
			i--;
		}
		i++;
		byte[] data = new byte[raw.length - i];
		for (int j = i; j < raw.length; j++) {
			data[j - i] = raw[j];
		}
		return new String(data, charSet);
	}

	/**
	 * 解密
	 * 
	 * @author 66
	 * @param encrypted
	 * @param privateKey
	 * 私钥
	 * @return
	 * @throws Exception
	 */
	public static byte[] decrypt(byte[] encrypted, PrivateKey privateKey) throws Exception {
		Cipher cipher = Cipher.getInstance(EncryptName, ProviderName);
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] re = cipher.doFinal(encrypted);
		return re;
	}	
	
	/**
	 * 解密
	 * @author 66
	 * @param encrypted
	 * @param privateKey
	 * @param transName
	 * @return
	 * @throws Exception
	 */
	public static byte[] decryptWithTransformation(byte[] encrypted, PrivateKey privateKey) throws Exception {
		Cipher cipher = Cipher.getInstance(AlogrithmName, ProviderName);
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] re = cipher.doFinal(encrypted);
		return re;
	}
	
	/**
	 * 解密
	 * @param encrypt
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	public static String decryptWithTransformation(String encrypt,PrivateKey privateKey) throws Exception{
		byte[] input = Hex.decode(encrypt);
		byte[] raw = decryptWithTransformation(input, privateKey);
		// 标志位为0之后的是输入的有效字节
		int i = raw.length - 1;
		while (i > 0 && raw[i] != 0) {
			i--;
		}
		i++;
		byte[] data = new byte[raw.length - i];
		for (int j = i; j < raw.length; j++) {
			data[j - i] = raw[j];
		}
		return new String(data,charSet);
	}

	/**
	 * 加密
	 * @author 66
	 * @param input
	 *            加密数据
	 * @param publicKey
	 *            公钥
	 * @return
	 * @throws Exception
	 */
	public static byte[] encryptWidthTransformation(String input, PublicKey publicKey) throws Exception {
		Cipher cipher = Cipher.getInstance(AlogrithmName, ProviderName);
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		byte[] re = cipher.doFinal(input.getBytes(charSet));
		return re;
	}

	

	/**
	 * 获取公钥
	 * 
	 * @author 66
	 * @param pubKey
	 * @return
	 */
	public static PublicKey getPublicKey(String pubKey) {
		PublicKey publicKey = null;
		try {
			java.security.spec.X509EncodedKeySpec bobPubKeySpec = new java.security.spec.X509EncodedKeySpec(HexUtils.hexStr2Bytes(pubKey));
			// RSA对称加密算法
			java.security.KeyFactory keyFactory;
			keyFactory = java.security.KeyFactory.getInstance(AlogrithmName, ProviderName);
			// 取公钥匙对象
			publicKey = keyFactory.generatePublic(bobPubKeySpec);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return publicKey;
	}

	/**
	 * 获取私钥
	 * 
	 * @author 66
	 * @param priKey
	 * @return
	 */
	public static PrivateKey getPrivateKey(String priKey) {
		PrivateKey privateKey = null;
		try {
			PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(HexUtils.hexStr2Bytes(priKey));
			KeyFactory keyf = KeyFactory.getInstance(AlogrithmName, ProviderName);
			privateKey = keyf.generatePrivate(priPKCS8);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return privateKey;
	}

	/**
	 * 获取
	 * 
	 * @author 66
	 * @param publicKey
	 * @return
	 */
	public static RSAPublicKey getRSAPublicKey(PublicKey publicKey) {
		return (RSAPublicKey) publicKey;
	}

	/**
	 * 获取
	 * 
	 * @author 66
	 * @param privateKey
	 * @return
	 */
	public static BigInteger gePublictModules(PublicKey publicKey) {
		RSAPublicKey rsaPublicKey = (RSAPublicKey) publicKey;
		return rsaPublicKey.getModulus();
	}

	/**
	 * 
	 * @author 66
	 * @param publicKey
	 * @return
	 */
	public static BigInteger getPublicExponent(PublicKey publicKey) {
		RSAPublicKey rsaPublicKey = (RSAPublicKey) publicKey;
		return rsaPublicKey.getPublicExponent();
	}

}

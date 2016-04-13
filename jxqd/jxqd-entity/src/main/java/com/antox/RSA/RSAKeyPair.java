package com.antox.RSA;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import com.antox.utils.Base64;
import com.antox.utils.HexUtils;

/**
 * @author 66 simplify by Yu.
 * @see http://baike.baidu.com/link?url=vpgP7LSU-
 *      yE7LSTBLlw8KidxM0rG3m1s7BbYg640qd9681V3EYTylJ44S4OcKpCW
 */
public class RSAKeyPair {

	public RSAPublicKey publicKey;

	public RSAPrivateKey privateKey;

	public String publicKeyEncode;

	public String modulus;

	public String exponent;

	public String base64Exponent;
	public String base64Modulus;

	public RSAKeyPair(KeyPair p) {
		privateKey = (RSAPrivateKey) p.getPrivate();
		publicKey = (RSAPublicKey) p.getPublic();

		modulus = HexUtils.bigInt2Hex2(privateKey.getModulus().toByteArray());

		publicKeyEncode = HexUtils.byte2HexStr(publicKey.getEncoded());
		exponent = Integer.toHexString(publicKey.getPublicExponent().intValue());

		byte[] bytes = publicKey.getModulus().toByteArray();
		if (bytes[0] == 0) {

		}
		base64Modulus = Base64.encode(toArray(publicKey.getModulus()));
		base64Exponent = Base64.encode(toArray(publicKey.getPublicExponent()));
	}

	private byte[] toArray(BigInteger big) {
		byte[] first = big.toByteArray();
		if (first[0] == 0) // flag byte
		{
			byte[] bytes = new byte[first.length - 1];
			System.arraycopy(first, 1, bytes, 0, first.length - 1);
			return bytes;
		}
		return first;
	}

	public PublicKey getPublicKey() {
		return publicKey;
	}

	public PrivateKey getPrivateKey() {
		return privateKey;
	}

	public String getPublicKeyEncode() {
		return publicKeyEncode;
	}

	/***
	 * 模
	 * 
	 * @return
	 */
	public String getBase64Modulus() {
		return base64Modulus;
	}

	/**
	 * 公钥指数字符串，十六进制表示
	 * 
	 * @return
	 */
	public String getBase64Exponent() {
		return base64Exponent;
	}

	/***
	 * 模
	 * 
	 * @return
	 */
	public String getModulus() {
		return modulus;
	}

	/**
	 * 公钥指数字符串，十六进制表示
	 * 
	 * @return
	 */
	public String getExponent() {
		return exponent;
	}
}

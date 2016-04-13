package com.antox;

import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.security.KeyPair;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.util.Log4jConfigurer;

import com.antox.RSA.RSA;
import com.antox.RSA.RSAKeyPair;

public class TestRSA {
	
	private Logger logger = Logger.getLogger(TestRSA.class);
	
	static {
		try {
			Log4jConfigurer.initLogging("classpath:properties/log4j.properties");
		} catch(FileNotFoundException ex) {
			System.err.println(ex.getMessage());
		}
	}

	@Test
	public void testGenerateKeyPair() {
		try {
		  KeyPair kp = 	RSA.generateKeyPair();
		  RSAKeyPair rsaKp = new RSAKeyPair(kp);
		  String name="yelp";
		  byte[] buf = RSA.encrypt(name,rsaKp.getPublicKey());
		  logger.info(new String(RSA.decrypt(buf, rsaKp.getPrivateKey())));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

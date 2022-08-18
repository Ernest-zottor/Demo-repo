package com.java.secureRandom.tutorials;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class SecureRandomUtil {

//	public static String generateCode() throws NoSuchAlgorithmException{
//		SecureRandom random = SecureRandom.getInstanceStrong();
//		int randomCode = random.nextInt(9000) + 1000;
//		return String.valueOf(randomCode);
//	}
//	
	public static String generateCode() {
		String code = "";
		try {
			SecureRandom random = SecureRandom.getInstanceStrong();
			int randomCode = random.nextInt(9000) + 1000;
			code = String.valueOf(randomCode);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return code;
	}
	
}

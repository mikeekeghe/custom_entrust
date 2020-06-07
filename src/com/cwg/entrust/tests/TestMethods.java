package com.cwg.entrust.tests;

import org.springframework.web.bind.annotation.RequestBody;

public class TestMethods {

	public static void main(String[] args) {
		
		String output = getRandom();
//		Boolean output = getIsValidToken("abcd", "abcd");
		System.out.println(output);

	}

	private static String getRandom() {
		final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		int count = 19;
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
			builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
	
	private static Boolean getIsValidToken(String input, String token)  {
		Boolean result = false;
		if (input.equalsIgnoreCase(token)) {
			result = true;
		}

		return result;
	}
}

package com.trinitysolucoes.fastdelivery.geocode.util;

public class StringUtils {
	/**
	 * Remove todos caracteres não numéricos.
	 * 
	 * @param str String contendo números.
	 * @return
	 */
	public static String removeNonNumericCharacter(String str) {
		if (str != null) {
			str = str.replaceAll("[^0-9]", "");
			str = str.replaceAll("\\s+", "");
		}
		return str;
	}
}

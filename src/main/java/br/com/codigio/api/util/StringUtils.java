package br.com.codigio.api.util;

public class StringUtils {
	/**
	 * Remove todos caracteres não numéricos.
	 */
	public static String removeNonNumericCharacter(String str) {
		if (str != null) {
			str = str.replaceAll("[^0-9]", "");
			str = str.replaceAll("\\s+", "");
		}
		return str;
	}
}

package com.charlene.coffee.util.string;

public class StringUtils {
	public static boolean isBlank(String string) {
		return string == null || string.trim().length() == 0;
	}

	public static boolean isNotBlank(String string) {
		return !isBlank(string);
	}

	public static String padString(String string) {
		if (isBlank(string)) {
			throw new IllegalArgumentException("Can't pad an empty string!");
		}
		final int padLength = 50;
		final char space = ' ';
		if (string.length() >= padLength) {
			// TODO can trim or format to second line
			return string;
		}
		char[] result = new char[padLength];
		int i = 0;
		while (i < string.length()) {
			result[i] = string.charAt(i++);
		}
		while (i < padLength) {
			result[i++] = space;
		}
		return new String(result);
	}
}

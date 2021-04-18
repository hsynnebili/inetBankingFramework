package com.class19;

public class Application {
	public int a;
	private String str;

	String Reverse(String str) {
		String result = "";
		for (int j = str.length() - 1; j >= 0; j--) {
			result = result + str.charAt(j);
		}
		return result;
	}

	public boolean isPalindrome(String str) {

		String reverseStr = Reverse(str);

		if (str.equalsIgnoreCase(reverseStr)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPalindrome2(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

	String[] getStringArrayFromString(String str) {
		String[] stringArray = str.split("-");
		return stringArray;
	}

}

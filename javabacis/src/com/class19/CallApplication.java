package com.class19;

public class CallApplication {

	public static void main(String[] args) {
		Application c = new Application();
		
		String str = "madam";
		String reverseStr = c.Reverse(str);

		if (str.equalsIgnoreCase(reverseStr)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}

		System.out.println("---------");

		if (c.isPalindrome(str)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}

		System.out.println("---------");

		if (c.isPalindrome2(str)) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
		
		
		String s = "";
		str = "Taha-is-a--good-boy";
		String[] strArray = c.getStringArrayFromString(str);

		for (int k = 0; k < strArray.length; k++) {
			System.out.println(strArray[k]);
		}
		
//		String str = "melek";
//		String result = "";
//		for (int j = str.length() - 1; j >= 0; j--) {
//			result = result + str.charAt(j);
//		}
//		System.out.println(result);
//
//		str = "elion";
//		result = "";
//		for (int j = str.length() - 1; j >= 0; j--) {
//			result = result + str.charAt(j);
//		}
//		System.out.println(result);
//
//		str = "veli";
//		result = "";
//		for (int j = str.length() - 1; j >= 0; j--) {
//			result = result + str.charAt(j);
//		}
//		System.out.println(result);
//		
//		System.out.println("---------");
//
//		result = c.Reverse("melek");
//		System.out.println(result);
//		result = c.Reverse("elion");
//		System.out.println(result);
//		result = c.Reverse("veli");
//		System.out.println(result);
	}
	
}

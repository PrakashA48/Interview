package com.today;

public class Demo {

	public static void main(String[] args) {

		String str = "This is a Java Program";
		str = str.toLowerCase();
		
		System.out.println(str);

		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);

		}

		System.out.println(str2);

	}

}

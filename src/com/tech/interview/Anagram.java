package com.tech.interview;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "prakash";

		String str2 = "hPrakasKJK";

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		if (ch1.length != ch2.length) {
			System.out.println("This is not the anagram");
			System.exit(0);
		}
		System.out.println("Anagram");

	}

}

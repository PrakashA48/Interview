package com.tech.interview1;

import java.util.Arrays;

public class AnagramDemo {

	public static boolean isangram(String s1, String s2) {
		boolean value = false;

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			value = true;

		}
		return value;

	}

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bca";
		String s3 = "LISTEN";
		String s4 = "SILENT";

		System.out.println(isangram(s1, s3));
		System.out.println(isangram(s1, s2));
		System.out.println(isangram(s4, s3));
		

	}

}

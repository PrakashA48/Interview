package com.today;

public class Database {

	public static void main(String[] args) {
//		String s1 = "Prakash";
//		String s2 = "prakash";
		// System.out.println(s1=s2);
		String s1 = new String("java");
		String s2 = new String("JAVA");
		System.out.println(s1 = s2);

		System.out.println(s1 = s2);

		String str = "Prakash";
		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println(str2);
	}

}

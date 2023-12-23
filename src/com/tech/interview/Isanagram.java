package com.tech.interview;

import java.util.Arrays;

public class Isanagram {
	
	 static String str1 = "abc";
	
	 static String str2 = "SILENT";
	
	 static String str3 = "LISTEN";
	
	
	public static boolean isAnagram(String str1, String str2) {
		
		//boolean value = false;
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
	 Arrays.sort(arr2);
		
//		if(Arrays.equals(arr1,arr2)) {
//			value = true;
//		}
		
		return Arrays.equals(arr1,arr2);
		
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram(str1, str3));
		System.out.println(isAnagram(str2, str1));
		System.out.println(isAnagram(str2, str3));
	}

}

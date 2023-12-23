package com.tech.interview;

import java.util.Arrays;

public class Exnagram {
	
	public static void main(String[] args) {
		String s1 =  "LISTEN";
		
		String s2 = "SILENTjgj";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2)) {
			System.out.println("This is the anagram");
		}else {
			System.out.println("This is not the anagram");
		}
		
		
		
//		for(Character num : c1) {
//			
//			if(c1 != c2) {
//				System.out.println(c1);
//				System.out.println(c2);
//				System.out.println("Not anagram");
//				System.exit(0);
//			}
//		}
//		System.out.println("anagram");
		
//		for(int i=0; i<c1.length; i++) {
//			if(c1[i] != c2[i]) {
//				System.out.println("Not Anagram");
//				System.exit(0);
//			}
//		}
//		System.out.println("Anagram");
	}

}

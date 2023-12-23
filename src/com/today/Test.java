package com.today;

import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(4);
		Set<Integer> s2 = new HashSet<Integer>(s1);
		s2.add(1);
		s2.add(2);
		s2.add(3);
		s2.add(5);
		
		System.out.println(s2);
		
		
		
		
		
		
		
		

	}

}

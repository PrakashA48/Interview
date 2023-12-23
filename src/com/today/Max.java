package com.today;

import java.util.Arrays;
import java.util.List;

public class Max {

	public static void main(String[] args) {
	
		
		//Integer [] arr =  {1,2,3,4,5,6};
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		Integer maximum = Integer.MIN_VALUE;
		
		for(Integer num :list  ) {
			if(num > maximum  ) {
				maximum = num;
				System.out.print(maximum+" ");
			}
			
		}
		System.out.println("\n"+maximum);
		
		Integer minimum = Integer.MAX_VALUE;
		for(Integer num :list  ) {
			if(num < minimum  ) {
				minimum = num;
				System.out.print(minimum+" ");
			}
			
		}
		System.out.println("\n"+minimum);

	}

}

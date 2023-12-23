package com.today;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		String str = "Duplicate content is defined as content that is an exact copy of content found elsewhere.";
		String word[] = str.split("\\s");

		// Map<String, Integer> map = new HashMap<String, Integer>();

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String words : word) {
			if (map.get(words) != null) {
				map.put(words, map.get(words) + 1);
			} else {
				map.put(words, 1);
			}
		}
		System.out.println(map.entrySet());
		System.out.println(Collections.min(map.entrySet(), Map.Entry.comparingByValue()).getKey());
		
		System.out.println(Collections.max(map.entrySet(),Map.Entry.comparingByKey()).getValue());
		System.out.println(Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey());
		
		
		
//		for(Map.Entry<Object, Integer> entry =  (Entry<Object, Integer>) map.entrySet()) {
//			
//			if(entry.getValue()>numberOccurance) {
//				numberOccurance = entry.getKey();
//				occurancevalue = entry.getValue();
//			}
//		}
//		System.out.println(numberOccurance);
//		System.out.println(occurancevalue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		Set<String> keys = map.keySet();
//
//		for (String kword : keys) {
//			if (map.get(kword) == 1) {
//				System.out.println(
//						"Duplicate from String is-- " + kword + "---occurance of Character---" + map.get(kword));
//			}
//
//  	}
	}
}

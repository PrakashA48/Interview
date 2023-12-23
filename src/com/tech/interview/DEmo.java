package com.tech.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DEmo {

	public static void main(String[] args) {
		//15,20,25,98,15,97,98
	//	o/p  15,98
		
		List<Integer> list1 = Arrays.asList(15,20,25,98,15,97,98);
		Set<Integer> set = new LinkedHashSet<Integer>();
	list1.stream().filter(n -> !set.add(n)).forEach(g -> System.out.print(g+ " "));
//		list1.stream().distinct()
//		.forEach(s -> System.out.print(s + " "));
//		System.out.println();
		
//		List<Integer> li =list1.stream().distinct().collect(Collectors.toList());
//		
//		System.out.println(li);
		
		System.out.println();
		
//		List<Integer> removeduplicate = list1.stream().filter(n -> !set.add(n)).collect(Collectors.toList());
//		
//		System.out.println(removeduplicate);
		System.out.println();
		Integer [] num = new Integer[list1.size()];
		list1.toArray(num);
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(Integer number : num) {
			if(map.containsKey(number)) {
				map.put(number, map.get(number)+1);
			}else {
				map.put(number, 1);
			}
		}
		
		Set<Integer> keys = map.keySet();
		
		for(Integer key : keys) {
			if(map.get(key) >1) {
				System.out.println(key);
			}
		}
		
		

	}

}

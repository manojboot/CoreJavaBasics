package com.example.collectionss.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample1 {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "java");
		map.put(2, "spring mvc");
		map.put(3, "spring boot");
		map.put(4, "adf");
		map.put(5, "angular");
		map.put(6, "aws");

		System.out.println(map.entrySet().stream().filter(e->e.getKey()>2).collect(Collectors.toList()));
		
		System.out.println(map.entrySet().stream().filter(e->e.getValue().equals("java")).collect(Collectors.toList()));

		
	}

}

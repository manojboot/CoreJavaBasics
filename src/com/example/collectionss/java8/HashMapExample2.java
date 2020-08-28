package com.example.collectionss.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapExample2 {
	
		
		public static void main(String[] args) {
			
			Map<String,String> map = new HashMap<String,String>();
			map.put("java", "Head First Java");
			map.put("Spring", "Spring in Action");
			map.put("Design Patterns", "Head First with Design Patterns");
			map.put("JavaScript", "Head First with JavaScript");
			map.put("Angular", "Pro Angular");
			map.put("Microservices", "Monolith To Microservice");
			
			System.out.println(map.entrySet().stream().filter(x->x.getValue().contains("Head First")).collect(Collectors.toList()));
			
			System.out.println(map.entrySet().stream().filter(x->x.getValue().startsWith("Spring")).map(Map.Entry::getKey).collect(Collectors.toList()));
		}

}

package com.example.collectionss.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

		public static void main(String[] args) {
			
			Map<Integer,String> map = new HashMap<Integer,String>();
			map.put(120, "tom");
			map.put(131, "neha");
			map.put(141, "sandra");
			map.put(151, "donnie");
			map.put(161, "maddy");
			map.put(171, "tony");
			map.put(181, "sania");
			map.put(241, "samuel");
			map.put(120, "tom");
			System.out.println(map);
			for(Map.Entry<Integer, String> m1 : map.entrySet()) {
				
				System.out.println(m1.getKey() +" " +m1.getValue());
			}
		}
}

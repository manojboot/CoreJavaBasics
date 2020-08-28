package com.example.collectionss.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SynchronizedHashMapExample1 {
	
	
		public static void main(String[] args) {
			
			Map<String,Integer> map =  Collections.synchronizedMap(new HashMap<String,Integer>());
			map.put("sam", 212);
			map.put("manan", 412);
			map.put("nun", 562);
			map.put("karan", 322);
			map.put("simran", 100);
			
			for(Map.Entry<String, Integer> m2 : map.entrySet()) {
				System.out.println(m2.getKey() +" " +m2.getValue());
			}
			
			Set set = map.entrySet();
			synchronized (map) {
				Iterator it = set.iterator();
				while(it.hasNext())
				{
					Map.Entry m1 = (Map.Entry) it.next();
					System.out.println(m1.getKey());
				}
			}
		}
		

}

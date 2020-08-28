package com.example.collectionss.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample1 {
	
	
	
			public static void main(String[] args) {
				
				Map<String,Integer> map = new ConcurrentHashMap<String,Integer>();
				map.put("sunny", 36);
				map.put("virat", 17);
				map.put("jack", 24);
				map.put("raina", 41);
				map.put("neha",27);
				
				//ConcurrentHashMap is better suited for situation where we have multiple readers and less writers or 
				//few writers since map gets locked only during write operation.If we have equal number of reader and writer
				//then ConcurrentHashMap will perform in line of Hashtable and synchronized HashMap.
				//ConcurrentHashMap is specially designed for concurrent use ie more then one thread.By default it allows 16 thread to read and write from map without external synchronization
				//Never locks the whole map instead divide map into segments and locking is done on those.
				for(Map.Entry<String, Integer> m1 : map.entrySet()) {
					System.out.println(m1.getKey() +" " +m1.getValue());
				}
			}

}

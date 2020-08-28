package com.example.collectionss.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample1 {
	
	
	
			public static void main(String[] args) {
				
				Hashtable<Integer,String> hashT = new Hashtable<Integer,String>();
				hashT.put(12, "mike");
				hashT.put(32, "samy");
				hashT.put(56, "chinky");
				hashT.put(97, "nunu");
				hashT.put(31, "sonu");
				
				Enumeration names;
				Integer key;
				names = hashT.keys();
				
				while(names.hasMoreElements()) {
					key = (Integer) names.nextElement();
					System.out.println( key +" " +hashT.get(key));
				}
				
 			}

}

package com.example.collectionss.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {

	
		public static void main(String[] args) {
			
			Set<String> set = new HashSet<String>();
			set.add("mike");
			set.add("neha");
			set.add("ranvir");
			set.add("sahid");
			set.add("jaquline");
			set.add("victoria");
			set.add("mike");
			set.add(null);
			System.out.println("Set is un-ordered collection.It contains unique items not allow duplicate items and allow null values");
			System.out.println("Ordering is based on implementation i.e. HashSet,LinkedHashSet,TreeSet and doesn't allow positional access");

			for(String str : set) {
				
				System.out.println(str);
			}
		}
}

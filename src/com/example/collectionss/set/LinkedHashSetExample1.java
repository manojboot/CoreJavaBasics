package com.example.collectionss.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample1 {


			public static void main(String[] args) {
				
				Set<String> set = new LinkedHashSet<String>();
				set.add("neha");
				set.add("ranvir");
				set.add("sahid");
				set.add("jaquline");
				set.add("victoria");
				set.add("mike");
				set.add("neha");
				set.add("null");
				set.add("victoria");
				
				System.out.println("LinkedList is ordered collection which maintains insertion order");
				System.out.println(set);
				Iterator<String> itr = set.iterator();
				while(itr.hasNext()) {
					System.out.println("Element: " +itr.next());
				}
			}
}

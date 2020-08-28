package com.example.collectionss.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
	
		public static void main(String[] args) {
			
			Set<String> set = new TreeSet<String>();
			set.add("neha");
			set.add("ranvir");
			set.add("sahid");
			set.add("jaquline");
			set.add("victoria");
			set.add("mike");
			set.add("neha");
			set.add("victoria");
			
			System.out.println("TreeSet is ordered collection and allows elelment in ascending order");
			System.out.println(set);
		}
}

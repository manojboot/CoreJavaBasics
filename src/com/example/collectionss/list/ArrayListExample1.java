package com.example.collectionss.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {
	
	
				public static void main(String[] args) {
					
					List<String> list = new ArrayList<String>();
					list.add("tighmanshu");
					list.add("irfan");
					list.add("sanjay");
					list.add("varun");
					list.add("pankaj");
					list.add("anurag");
					list.add("neha");
					list.add("jack");
					list.add("neha");
					System.out.println("List is ordered collection and elements present are in insertion order in arraylist");
					System.out.println("List size is :" +list.size() +" "  +"Elements of list are : " +list);
					System.out.println(list.get(3));
					for(String s2 : list) {
						System.out.println(s2);
					}
					
					Iterator<String> itr = list.iterator();
					while(itr.hasNext()) {
						
						System.out.println("Elements Of List: " +itr.next());
					}
				}

}

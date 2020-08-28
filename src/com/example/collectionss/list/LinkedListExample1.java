package com.example.collectionss.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {
	
			public static void main(String[] args) {
				
				List<String> list = new LinkedList<String>();
				list.add("tighmanshu");
				list.add("irfan");
				list.add("sanjay");
				list.add("varun");
				list.add("pankaj");
				list.add("anurag");
				list.add("neha");
				list.add("jack");
				list.add("anurag");
				
				System.out.println("List is Ordered collection and allows dupplicate");
				System.out.println("Elments in List are :" +list);
				
				for(String str : list) {
					System.out.println(str);
				}
			}

}

package com.example.collectionss.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUnmodifiableNetCracker {
	
	
		public static void main(String[] args) {
			
			List<String> list = new ArrayList<String>();
			list.add("mike");
			list.add("sandy");
			list.add("sana");
			list.add("alia");
			list.add("jack");
			System.out.println(list);
			
			List<String> unModifiableList = Collections.unmodifiableList(list);
			System.out.println(unModifiableList);
			unModifiableList.add("anna");
			System.out.println(unModifiableList);
		}

}

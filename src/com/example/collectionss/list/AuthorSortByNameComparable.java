package com.example.collectionss.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthorSortByNameComparable {
	
	
			public static void main(String[] args) {
				
				List<Author> list = new ArrayList<Author>();
				list.add(new Author("chetan","bhagat","Five Point Someone"));
				list.add(new Author("amish","tripathi","Legend Of SuhelDev"));
				list.add(new Author("sashi","tharoor","The Era of Darkness"));
				list.add(new Author("paulo","coelho","The Alchemist"));
				
				Collections.sort(list);
				System.out.println(list);
				
				for(Author al : list) {
					System.out.println(al.firstName +" " +al.lastName +" " +al.bookName);
				}
			}

}

package com.example.collectionss.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuthroComaratorMain {
	
			
		public static void main(String[] args) {
				
				ArrayList<Author2> list=new ArrayList<Author2>();  
				list.add(new Author2("chetan","bhagat","Five Point Someone"));
				list.add(new Author2("amish","tripathi","Legend Of SuhelDev"));
				list.add(new Author2("sashi","tharoor","The Era of Darkness"));
				list.add(new Author2("paulo","coelho","The Alchemist"));
				
				for(Author2 st: list){  
					System.out.println(st.firstName +" " +st.lastName +" " +st.bookName);  
					}
				Collections.sort(list,new AuthorSortByNameComparator());
				System.out.println(list);
				
				for(Author2 st: list){  
				System.out.println(st.firstName +" " +st.lastName +" " +st.bookName);  
				}
		}
}

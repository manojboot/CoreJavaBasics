package com.example.collectionss.list;

import java.util.Comparator;

public class AuthorSortByNameComparator implements Comparator<Author2> {

	
		public int compare(Author2 a1, Author2 a2) {
		
			
			return a1.firstName.compareTo(a2.firstName);
		}

		
		
		
}

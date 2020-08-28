package com.example.collectionss.list;

public class Author implements Comparable<Author>
	{
	  String firstName;
	  String lastName;
	  String bookName;
	  
	  public Author(String firstName, String lastName, String bookName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}

	@Override
	public int compareTo(Author o) {
		
	    int last = this.lastName.compareTo(o.lastName);

		return last;
	}
	  
	  
}

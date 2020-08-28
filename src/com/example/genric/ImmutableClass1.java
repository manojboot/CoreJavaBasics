package com.example.genric;


// In java immutable class means once an object is created we cannot change its content.In java all Wrapper class(Integer,Long,
// and String class is Immutable
// Class must be final,variables must be declared final,parameterized constructor,getter method for all variables but no setter method
public final class ImmutableClass1 {
	
		final int price;
		final String name;
		public int getPrice() {
			return price;
		}
		public String getName() {
			return name;
		}
		public ImmutableClass1(int price, String name) {
			this.price = price;
			this.name = name;
		}
       
		
}

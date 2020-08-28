package com.example.genric;

public class ImmutableClassTest {

	
			public static void main(String[] args) {
				
				ImmutableClass1 i1 = new ImmutableClass1(200,"Mike");
				System.out.println(i1.getPrice());
				System.out.println(i1.getName());
				
			//	i1.price = 400;
				
			}
}

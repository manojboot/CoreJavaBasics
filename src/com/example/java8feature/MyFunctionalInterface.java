package com.example.java8feature;


@FunctionalInterface
interface MyInterface{
	
	public int add(int x,int y);
}
public class MyFunctionalInterface {

		public static void main(String[] args) {
			
			MyInterface m1 = (x,y) -> x + y;
			System.out.println("Sum is : " +m1.add(121, 29));
		}
	
		
}

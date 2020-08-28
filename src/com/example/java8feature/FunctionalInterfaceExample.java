package com.example.java8feature;

@FunctionalInterface
interface greetings {
		void morningGreetings(String str);
}
public class FunctionalInterfaceExample implements greetings {

	public void morningGreetings(String str) {
		
			System.out.println(str);
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceExample f1 = new FunctionalInterfaceExample();
		f1.morningGreetings("Good Morning Madam");
	}
		

}

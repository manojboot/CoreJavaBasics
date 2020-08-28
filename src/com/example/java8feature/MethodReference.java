package com.example.java8feature;


interface Sayable{
	void say();
}
public class MethodReference {
	
		public static void saySomething() {
			System.out.println("This method willl say something for Method Reference");
		}
		
		public static void main(String[] args) {
			
			Sayable sayable = MethodReference::saySomething;
			sayable.say();
		}
}

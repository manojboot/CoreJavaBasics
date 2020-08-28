package com.example.genric;

public class ExampleA {
	
	public void eat(){
		System.out.println("I eat lunch");
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is example A");
		
		ExampleA s1 = new ExampleA();
		ExampleA s2 = new ExampleA();
		Object s3 = new ExampleA();
		
		
		String a1 = new String("abc");
		String a2 = new String("abc");

		
		if(a1.equals(a2)) {
			System.out.println("Welcome");
		}
		else {
			System.out.println("Welcome not");
		}
		if(a1 == a2) {
			System.out.println("not welcome");
		}else {
			System.out.println("Welcome sajan");

		}
	}

}

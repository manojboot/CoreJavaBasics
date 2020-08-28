package com.example.java8feature;

public class StringWithNPE {
	
		public static void main(String[] args) {
			
			String[] s1 = new String[10];
			System.out.println(s1);
			String s2 = s1[9].substring(0);
			System.out.println(s2);
		}

}

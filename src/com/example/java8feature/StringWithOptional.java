package com.example.java8feature;

import java.util.Optional;

public class StringWithOptional {
	
		public static void main(String[] args) {
			
			String[] s1 = new String[10];
			Optional<String> s2 = Optional.ofNullable(s1[9]);
			
			if(s2.isPresent()) {
				
				String s3 = s1[9].substring(3,7);
			}
			else {
				System.out.println("Cannot find substring");
			}
			
			s1[9] = "sajjanpuralibagh";
			Optional<String> s21 = Optional.ofNullable(s1[9]);
			
			if(s21.isPresent()) {
				
				String s31 = s1[9].substring(3,7);
				System.out.println(s31);
			}
			else {
				System.out.println("Cannot find substring second time");
			}
		}

}

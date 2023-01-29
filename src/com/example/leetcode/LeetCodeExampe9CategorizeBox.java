package com.example.leetcode;

import java.math.BigInteger;

public class LeetCodeExampe9CategorizeBox {

	public static void main(String[] args) {
		
		long length = 2909;
		long width = 3968;
		long height = 3272;
		long mass = 727;
		String typeA = null,category = null;
		String typeM = null;
		long volume = length*width*height;
		if((volume >= (int)Math.pow(10, 9)) || (length>=(10*10*10*10)) || (width>=(10*10*10*10)) || (height>=(10*10*10*10))){
			typeA = "Bulky";
		}if(mass >= 100) {
			typeM = "Heavy";
		}
		
		if(typeA == "Bulky" && typeM == "Heavy") {
			category = "Both";
		}else if(typeA == "Bulky" && typeM !="Heavy") {
			category = "Bulky";
		}
		else if(typeA != "Bulky" && typeM =="Heavy") {
			category = "Heavy";
		}
		else if(typeA != "Bulky" && typeM !="Heavy") {
			category = "Neither";
		}
		System.out.println(category);
	}
}

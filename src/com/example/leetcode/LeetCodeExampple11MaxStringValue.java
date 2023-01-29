package com.example.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LeetCodeExampple11MaxStringValue {

	public static void main(String[] args) {
		
		String str[] = {"5232","yv","22","c","yawgs","928","4003","2"};
		List<Integer> list = new ArrayList<>();
		for(String s : str)
		{
			
				list.add(wordsLength(s));
			
		}
		System.out.println(list);
		System.out.println(list.stream().max(Comparator.comparing(Integer::intValue)).get());
	}

	private static Integer wordsLength(String s) {
		char ch[] = s.toCharArray();
		boolean x = false;
		int y;
		for(Character c : ch) {
			if(Character.isAlphabetic(c)){
				x = true;
			}
		}
		if(x) {
			 y = s.length();
		}else {
			y = Integer.valueOf(s);
		}
		
		return y;
	}
}

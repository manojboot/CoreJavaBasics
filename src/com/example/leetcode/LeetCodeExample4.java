package com.example.leetcode;

public class LeetCodeExample4 {

	public static void main(String[] args) {
		
		String strs[] = {"alic3","bob","3","4","00000"};
		int strLen = 0;
		for(String s : strs)
		{
			char c[] = s.toCharArray();
			boolean count = false;
			for(Character c1 : c) {
				if(Character.isDigit(c1)) {
					count = true;
				}
				if(Character.isAlphabetic(c1))
				{
					strLen = s.length();
				}
				if(count) {
					strLen = s.length();
				}
			}
		}
		System.out.println(strLen);
	}
}

package com.example.leetcode;

public class LeetCodeExcample2 {

	public static void main(String[] args) {
		
		String jewels = "z";
		String stones = "ZZ";
		char j[] = jewels.toCharArray();
		char s[] = stones.toCharArray();
		int count = 0;
		for(Character c1 : s)
		{
			for(Character c2 : j)
			{
				if(c2.charValue() == c1.charValue())
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

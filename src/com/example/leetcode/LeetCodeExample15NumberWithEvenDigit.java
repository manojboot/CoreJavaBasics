package com.example.leetcode;

public class LeetCodeExample15NumberWithEvenDigit {

	public static void main(String[] args) {
		
		int nums[] = {12,345,2,6,7896};
		String str[] = new String[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			str[i] = String.valueOf(nums[i]);
		}
		int count=0;
		for(String s : str) {
			if(s.length()%2==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}

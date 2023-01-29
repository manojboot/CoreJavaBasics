package com.example.leetcode;

public class LeetCodeExampe5ConcatenationArray {

	public static void main(String[] args) {
		
		int []nums = {1,2,1};
		int []ans = new int[2*nums.length];
		for(int i=0;i<2*nums.length;i++)
		{
			if(i>(nums.length-1)) {
			ans[i] = nums[i - (nums.length)];
			}else {
			ans[i] = nums[i];
			}
		}
	}
}

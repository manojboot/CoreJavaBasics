package com.example.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeExample7ElementSum {

	public static void main(String[] args) {
		
		int nums[] = {1,15,6,3};
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		int numSums = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Summ of All Array Elements:" +numSums);
		int digitSum = 0,j=0;
		for(int i=0;i<nums.length;i++)
		{
			j = nums[i];
			while(j>0)
			{
				digitSum = digitSum + j%10;
				j = j/10;
			}
		}
		System.out.println("Sum of All Digits of Array:" +digitSum);
		System.out.println(Math.toIntExact(numSums-digitSum));
	}
}

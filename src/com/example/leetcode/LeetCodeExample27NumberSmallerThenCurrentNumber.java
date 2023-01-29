package com.example.leetcode;

import java.util.Arrays;

public class LeetCodeExample27NumberSmallerThenCurrentNumber {

	public static void main(String[] args) {

		int nums[] = {7,7,7,7};
		int sums2[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					count++;
				} else {
					sums2[i] = 0;
				}
			}
			sums2[i] = count;

		}
		for (int i = 0; i < sums2.length; i++) {
			System.out.println(sums2[i]);
		}
	}
}

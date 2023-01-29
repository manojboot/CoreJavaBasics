package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeExample20AvgEvenNumberDivisbleBy3 {

	public static void main(String[] args) {

		int nums[] = {1,2,4,7,10};
		List<Integer> list = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				list.add(nums[i]);
			}
		}
		for (int u : list) {
			if (u % 3 == 0) {
				list1.add(u);
			}
		}
		System.out.println(list1);
		if (!list1.isEmpty()) {
			double sum = list1.stream().collect(Collectors.averagingInt(Integer::intValue));
			System.out.println((int) sum);
		} else {
			System.out.println(-1);
		}
	}
}

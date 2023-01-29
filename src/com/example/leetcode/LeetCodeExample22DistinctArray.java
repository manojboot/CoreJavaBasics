package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeExample22DistinctArray {

	public static void main(String[] args) {
		
		int []nums1 = {1,2,3}; 
		int []nums2 = {2,4,6};
		List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
		if(list1.containsAll(list2)) {
			
		}
	}
}

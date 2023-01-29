package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCodeExample21ArrayOperations {

	public static void main(String[] args) {
		
		int []nums = {1,2,2,1,1,0};
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i] == nums[i+1])
			{
				nums[i] = nums[i]*2;
				nums[i+1] = 0;
			}else {
				nums[i] = nums[i];
			}
		}
		for(int i=0;i<nums.length;i++) {
		list.add(nums[i]);
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list );
	}
}

package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCodeExample18MinimumCommonValue {

		public static void main(String[] args) {
			
			int []nums1 = {1,2,3,6};
			int []nums2 = {2,3,4,5};
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<nums1.length;i++)
			{
				for(int j=0;j<nums2.length;j++)
				{
					if(nums1[i] == nums2[j])
					{
						list.add(nums1[i]);
					}
				}
			}
			System.out.println(list.get(0));
		}
}

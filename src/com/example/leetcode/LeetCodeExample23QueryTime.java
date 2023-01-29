package com.example.leetcode;

public class LeetCodeExample23QueryTime {
	
		public static void main(String[] args) {
			
			int []startTime = {4};
			int []endTime = {4};
			int queryTime = 4;
			int count = 0;
			for(int i=0;i<startTime.length && i<endTime.length;i++)
			{
				if((endTime[i] - startTime[i]) == queryTime)
				{
					count++;
				}
			}
			System.out.println(count);
		}
}

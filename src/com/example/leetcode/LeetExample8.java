package com.example.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetExample8 {

	public static void main(String[] args) {
		
		int nums[] = {-3,-2,-1,0,0,1,2};
		List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
		List<Integer> list1 = list.stream().filter(x-> x!=0).collect(Collectors.toList());
		int posCount = 0;
		int negCount = 0;
		System.out.println(list1);
		for(int i=0;i<list1.size();i++)
		{
			if(list1.get(i)>0)
			{
				posCount++;
			}else {
				negCount++;
			}
		}
		System.out.println(posCount +"---" +negCount);
		if(posCount>negCount)
		{
			System.out.println(posCount);
		}else {
			System.out.println(negCount);
		}
	}
}

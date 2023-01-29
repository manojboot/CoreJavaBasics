package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeExample25GreatestNumberOfCandies {

	public static void main(String[] args) {
		
		int []candies = {12,1,12};
		int []candiesX  = new int[candies.length];
		int extraCandies = 10;
		List<Integer> list = Arrays.stream(candies).boxed().collect(Collectors.toList());
		int maxCandy = list.stream().max(Comparator.comparing(Integer::intValue)).get();
		List<Boolean> bool= new ArrayList<>();
		System.out.println(maxCandy);
		for(int i=0;i<candies.length;i++)
		{
			candiesX[i] = candies[i] + extraCandies;
			
		}
		for(int i=0;i<candiesX.length;i++)
		{
			if(candiesX[i] >= maxCandy) {
				bool.add(true);
			}else {
				bool.add(false);
			}
		}
		System.out.println(bool);
	}
}

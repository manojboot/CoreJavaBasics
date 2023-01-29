package com.example.leetcode;

import java.util.Scanner;

public class LeetExample6PivotInteger {

	/*
	Given a positive integer n, find the pivot integer x such that:
	The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
	*/
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;int s = 0;
		for(int i=1;i<=x;i++)
		{
			sum = sum + i;
		}
		for(int i=x;i<=n;i++)
		{
			s = s + i;
		}
		if(sum == s)
		{
			System.out.println(x);
		}else {
			System.out.println(-1);
		}
	}
}

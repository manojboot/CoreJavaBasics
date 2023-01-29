package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCodeExample10DigitsDivideNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum;
		int copyNum = num;
		List<Integer> list = new ArrayList<>();
		while(num>0)
		{
			sum = num%10;
			list.add(sum);
			num = num/10;
		}
		System.out.println(list);
		int count = 0;
	    for(int i : list){
	            if(copyNum%i==0){
	                count++;
	            }
	    }
	    System.out.println(count);
	}
}

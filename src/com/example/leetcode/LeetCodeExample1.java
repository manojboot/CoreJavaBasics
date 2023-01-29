package com.example.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCodeExample1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	//	String s = str.strip();
		String s1[] = str.split(" ");
		List<String> list = new ArrayList<>();
		for(String s2 : s1) {
			list.add(s2);
		}
		String s = list.get(list.size()-1);
		System.out.println(s +" " +s.length());
	}
}

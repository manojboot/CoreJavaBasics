package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LeetCodeExample12SortingSentence {

	public static void main(String[] args) {
		
		String s = "Myself2 Me1 I4 and3";
		String str[] = s.split(" ");
		List<String> list = new ArrayList<>();
		for(String s1:str) {
			StringBuffer sb = new StringBuffer(s1);
			list.add(sb.reverse().toString());
		}
		Collections.sort(list);
		StringBuffer s3 = new StringBuffer();
		for(String s2 : list) {
			StringBuffer sb = new StringBuffer(s2);
			s3.append(sb.reverse().substring(0,s2.length()-1)).append(" ");
		}
		System.out.println(s3);
	}
}

package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode17AlternateDigitSum {

	public static void main(String[] args) {
		
		int n = 886996;
		String num = String.valueOf(n);
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<num.length();i++)
		{
			list.add(Integer.valueOf(String.valueOf(num.charAt(i))));
		}
	//	Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		int even = 0,odd = 0;
		for(int i=0;i<list.size();i++) {
			if(i%2==0) {
				even = even+list.get(i);
			}else {
				odd = odd + list.get(i);
			}
		}
		System.out.println(even-odd);
	}
}

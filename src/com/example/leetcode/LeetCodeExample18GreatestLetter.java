package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCodeExample18GreatestLetter {

	public static void main(String[] args) {
		
		String s = "lEeTcOdE";
		char s1[] = s.toCharArray();
		List<Character> list = new ArrayList<>();
		for(char c : s1)
		{
			list.add(c);
		}
		Collections.sort(list);
		System.out.println(list);
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++) 
			{
				if(String.valueOf(list.get(i)).equalsIgnoreCase(String.valueOf(list.get(j))))
				{
					System.out.println(list.get(i));
				}
			}
		}
	}
}

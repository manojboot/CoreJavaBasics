package com.example.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LeetCodeExample15GoodString {

		public static void main(String[] args) {
			
			String s = "abacbc";
			List<Character> list = new ArrayList<>();
			for(int i=0;i<s.length();i++)
			{
				list.add(s.charAt(i));
			}
			System.out.println(list);
			Set<Long> set = new HashSet<>();
			 Map<Character, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			 System.out.println(map);
			 for(Map.Entry<Character,Long> m1 :map.entrySet())
             {
                 set.add(m1.getValue());
             }
			 if(s.length()%2!=0 || set.size()>1) {
				 System.out.println("false");
			 }else {
				 System.out.println("tru");
			 }
		}
}

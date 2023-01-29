package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeExample26SortPeople {

	public static void main(String[] args) {
		
		String []names = {"Alice","Bob","Bob"}; 
		int []heights = {155,185,150};
		List<User> users = new ArrayList<>();
		String sortedName[] = new String[names.length];
		for(int i=0;i<names.length && i<heights.length;i++)
		{
			String name = names[i];
			int height = heights[i];
			users.add(new User(name, height));
		}
		List<String> sortedByHeight = users.stream().sorted(Comparator.comparing(User::getHeight).reversed()).map(User::getName).collect(Collectors.toList());
		for(int i=0;i<sortedByHeight.size();i++) {
			sortedName[i] = sortedByHeight.get(i);
		}
	}
	
	static class User{
		public User(String name, int height) {
			this.name = name;
			this.height = height;
		}
		public User() {
			
		}
		private String name;
		private int height;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		
	}
}

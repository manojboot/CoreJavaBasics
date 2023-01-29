package com.example.leetcode;

public class LeetCodeExample3 {

	public static void main(String[] args) {
		
		String s = "codeleet";
		char a[] = new char[s.length()];
		int indices[] = {4,5,6,7,0,2,1,3};
		StringBuffer str = new StringBuffer();
		for(int i=0;i<indices.length;i++)
		{
			a[indices[i]] = s.charAt(i);
		}
		for(int i=0;i<a.length;i++)
		{
			str.append(a[i]);
		}
		System.out.println(str.toString());
		
	}
}

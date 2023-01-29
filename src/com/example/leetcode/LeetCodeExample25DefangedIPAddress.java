package com.example.leetcode;

public class LeetCodeExample25DefangedIPAddress {

	public static void main(String[] args) {
		String address = "1.1.1.1";
		String add[] = address.split(".");
		StringBuilder a = new StringBuilder();
		for(int i=0;i<address.length();i++)
		{
			if(String.valueOf(address.charAt(i)).equals("."))
			{
				a.append("[.]");
			}else {
				a.append(String.valueOf(address.charAt(i)));
			}
		}
		System.out.println(a);

	}
}

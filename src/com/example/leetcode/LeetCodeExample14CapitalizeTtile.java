package com.example.leetcode;

public class LeetCodeExample14CapitalizeTtile {

	public static void main(String[] args) {
		
		String title = "L hV";
		String t[] = title.split(" ");
		StringBuffer sb = new StringBuffer();
		for(String s : t)
		{
			if(s.length()>2) {
				System.out.println(s +":: " +s.length());
				sb.append(Character.toString(s.charAt(0)).toUpperCase()).append(s.substring(1, s.length()).toLowerCase()).append(" ");

			}else {
				System.out.println(s +":: " +s.length());

				sb.append(s).toString().toLowerCase();
			}
		}
		System.out.println(sb);
	}
}

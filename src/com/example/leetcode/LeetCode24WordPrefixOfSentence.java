package com.example.leetcode;

public class LeetCode24WordPrefixOfSentence {

	public static void main(String[] args) {
		
		String sentence = "i love eating burger";
		String searchWord = "burg";
		String sent[] = sentence.split(" ");
		int count=0;
		for(int i=1;i<sent.length;i++)
		{
			if(sent[i].startsWith(searchWord)) {
				count=i+1;
				break;
			}else {
				count=-1;
			}
		}
		System.out.println(count);
	}
}

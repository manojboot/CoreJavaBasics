package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LeetCodeExample13MaximumWordinSentence {

	public static void main(String[] args) {
		
		String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		List<String> list = new ArrayList<>();
		Map<Integer,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<sentences.length;i++)
		{
			list.addAll(Arrays.asList(sentences[i].split(" ")));
			map.put(i, list.size());
			list.clear();
		}
		System.out.println(list);
		System.out.println(map);
		int maxv = Collections.max(map.values());
		System.out.println(maxv);
	}
}

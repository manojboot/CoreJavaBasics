package com.example.collectionss.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStream1 {
	
			public static void main(String[] args) {
				
				List<String> list = new ArrayList<String>();
				list.add("andy");
				list.add("sandy");
				list.add("neha");
				list.add("aisha");
				list.add("samuel");
				list.add("tom");
				list.add("nicole");
				list.add("sam");
				list.add("aisha");
				list.add("neha");

				System.out.println(list);
				
				System.out.println(list.stream().count());
				System.out.println(list.stream().findFirst());
				System.out.println(list.stream().findAny());
				System.out.println(list.stream().filter(m->m.startsWith("n")).count());
				System.out.println(list.stream().filter(m->m.startsWith("n")).collect(Collectors.toList()));

				System.out.println(list.stream().distinct().collect(Collectors.toList()));
				
				System.out.println(list.stream().sorted().collect(Collectors.toList()));

			}
			

}

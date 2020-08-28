package com.example.java8feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8CollectorsExample {

	
		public static void main(String[] args) {
			
			List<String> list = new ArrayList<String>();
			list.add("welcome");
			list.add("dell");
			list.add("infosys");
			list.add("paypal");
			list.add("dell");
			list.add("cognizant");
			list.add("tcs");
			list.add("welcome");
			
			Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
			
			System.out.println(map);
		}
		
		
}

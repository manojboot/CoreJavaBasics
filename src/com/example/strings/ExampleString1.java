package com.example.strings;

public class ExampleString1 {
	
	
	public static void main(String[] args) {
		
		String str = "aaaaadddmmmmmmmmm";
		//Print output a5d3m9
		int count = 0;
        char runChar = str.charAt(0);

		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i) == runChar) {
				++count;
			}
			else {
				sb.append(runChar).append(count);
				count=1;
				runChar = str.charAt(i);
				
			}
		}
		System.out.println(sb.append(runChar).append(count));
	}

}

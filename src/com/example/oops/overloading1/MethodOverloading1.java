package com.example.oops.overloading1;

public class MethodOverloading1 {
	
		public static void main(String args[])
		{
			MethodOverloading1 m1 = new MethodOverloading1();
			System.out.println(m1.sum(23, 67));
			System.out.println(m1.sum(23, 67,1200));
			System.out.println(m1.sum(23, 67,78.1));
		}
		
		public int sum(int a,int b)
		{
			return a+b;
		}
		public int sum(int a,int b,int c)
		{
			return a+b+c;
		}
		
		public double sum(int a,int b,double c)
		{
			return a+b+c;
		}
}

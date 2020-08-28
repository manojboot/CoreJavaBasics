package com.example.oops.overriding;


	class MethodOverriding{
		
			public void overload1() {
				System.out.println("Overloading is Running in Super Class");
			}
			public void overriding1() {
				System.out.println("Overriding is Running in Super Class");
			}
		}
	public class MethodOverriding1 extends MethodOverriding{
		
			
			@Override
		public void overload1() {
			// TODO Auto-generated method stub
				System.out.println("Overrding in Base Class");
		}

		@Override
		public void overriding1() {
			// TODO Auto-generated method stub
			System.out.println("Overrding in Base Class");
		}

			public static void main(String[] args) {
				
				MethodOverriding1 m1 = new MethodOverriding1();
				m1.overriding1();
				m1.overload1();
				MethodOverriding m2 = new MethodOverriding();
				m2.overload1();
				m2.overriding1();
				MethodOverriding m3 = new MethodOverriding1();
				m3.overload1();
				

			}
		
	}

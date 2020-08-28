package com.example.threads;

public class Thread1UsingClass extends Thread{
	
		public void run() {
			
			System.out.println("This code is running by extending Thread class");
		}
		
		public static void main(String[] args) {
			
			Thread1UsingClass t1 = new Thread1UsingClass();
			t1.start();
			//Thread can be run by creating instance of Thread class and calling its start() method
		}
}

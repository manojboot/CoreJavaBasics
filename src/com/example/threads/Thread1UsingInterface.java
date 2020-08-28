package com.example.threads;

public class Thread1UsingInterface implements Runnable{
		
		public void run() {
			System.out.println("This Thread is running by implementing Runnable Interface");
		}
		
		public static void main(String[] args) {
			
			Thread1UsingInterface t1 = new Thread1UsingInterface();
			Thread t = new Thread(t1);
			t.start();
		}
}

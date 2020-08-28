package com.example.threads;

public class Thread1Example1 extends Thread{
	
		public static int salary = 42000;
		
		public void run() {
			System.out.println("This is run method " +salary);
			salary = salary + 3000;
		}
		
		public static void main(String[] args) {
			
			Thread1Example1 t1 = new Thread1Example1();
			t1.start();
			
			while(t1.isAlive()) {
				System.out.println("Thread Waiting");
			}
			System.out.println(salary);
			salary = salary+2000;
			System.out.println(salary);
		}

}

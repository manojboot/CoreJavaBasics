package com.example.threads;

public class ThreadExample4 extends Thread{
	
		public static void main(String[] args) {
			
			ThreadExample4 t1 = new ThreadExample4();
			ThreadExample4 t2 = new ThreadExample4();
			t1.setPriority(MIN_PRIORITY);
			t2.setPriority(MAX_PRIORITY);
			t1.start();
			t2.start();
			
		}
		//thread schedular schedules the threads according to their priority (known as preemptive scheduling).
		//But it is not guaranteed because it depends on JVM specification that which scheduling it chooses.
		public void run() {
			
			
			System.out.println("Running Thread Name is :" +Thread.currentThread().getName() +" " +Thread1Example1.currentThread().getId());
			System.out.println("Running Thread Priority is :" +Thread.currentThread().getPriority());

		}

}

package com.example.threads;

public class ThreadExampleJoin extends Thread {
		
		public static void main(String[] args) {
			
			ThreadExampleJoin t1 = new ThreadExampleJoin();
			ThreadExampleJoin t2 = new ThreadExampleJoin();
			ThreadExampleJoin t3 = new ThreadExampleJoin();
			t1.start();
			try {
				t1.join(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			t2.start();
			t3.start();
		}
		
		// The join() method waits for the thread to die.It causes the currently running thread to stop executing until 
		// the thread it joins completes its task.
		
		public void run() {
			
			for(int i=1;i<=5;i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
		
}

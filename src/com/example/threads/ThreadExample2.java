package com.example.threads;

public class ThreadExample2 extends Thread{

		public static void main(String[] args) {
			
			ThreadExample2 t1 = new ThreadExample2();
			ThreadExample2 t2 = new ThreadExample2();
			t1.start();
			t2.start();
			t2.start();
		}
		//As you know at a time one thread is executed if we sleep thread for specified time scheduler picks other thread.
		public void run() {
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
		}
		//No we can not start a thread after its started already.if you do so IllegalThreadStateException will be thrown.In such case Thread will run but for second time it will throw exception
		
}

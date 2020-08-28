package com.example.threads;

public class ThreadExample3 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		ThreadExample3 t1 = new ThreadExample3();
		ThreadExample3 t3 = new ThreadExample3();
		
		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t3);

		tt1.run();
		tt2.run();		//Directly calling run method will be like calling normal object and Thread Synchronization will not Take place
		
	}

}

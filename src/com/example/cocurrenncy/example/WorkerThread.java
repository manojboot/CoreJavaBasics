package com.example.cocurrenncy.example;

public class WorkerThread implements Runnable{
	
	private String message;
	
	public WorkerThread(String message) {
		this.message = message;
	}

	public void run() {
		
		System.out.println(Thread.currentThread().getName() +"Start Message :" +message);
		processMessage();
		System.out.println(Thread.currentThread().getName() +"End Message :");

	}

	private void processMessage() {
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	

}

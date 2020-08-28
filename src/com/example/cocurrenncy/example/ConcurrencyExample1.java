package com.example.cocurrenncy.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyExample1 {
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(10);
		for(int i=1;i<20;i++) {
			Runnable worker = new WorkerThread(" " +i);
			executor.execute(worker);
		}
		executor.shutdown();
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Finieshed All Threads");
	}

}

package com.ThreadAssignment;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//24.Create a thread pool of 3 threads using executer framework. 
//Create 10 threads which will run by reusing threads in thread pool.
class PoolDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("Welcome...." + Thread.currentThread().getName());
	}

}

public class ThreadQ24 {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (int i = 0; i <= 10; i++) {
			service.execute(new PoolDemo());
		}
		service.shutdown();
	}

}

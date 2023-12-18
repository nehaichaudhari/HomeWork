package com.ThreadAssignment;

public class ThreadDemo extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " value" + i);
		}
	}

	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
		t.start();
	}
}

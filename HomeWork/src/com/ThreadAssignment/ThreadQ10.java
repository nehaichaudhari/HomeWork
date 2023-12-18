package com.ThreadAssignment;

//10.Show use of all 3 join methods of thread class.
public class ThreadQ10 extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Thread 1: " + i);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 11; i <= 20; i++) {
					System.out.println("Thread 2: " + i);
				}
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				for (int i = 21; i <= 30; i++) {
					System.out.println("Thread 3: " + i);
				}
			}
		};

		t1.start();
		t1.join();
		t3.start();
		t3.join(2500);
		t2.start();
		t2.join(1000, 1500);
	}
}

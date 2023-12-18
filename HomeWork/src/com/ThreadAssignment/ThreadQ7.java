package com.ThreadAssignment;
//7.WAP to show use of sleep method

public class ThreadQ7 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " :" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished....");
	}

	public static void main(String[] args) {
		ThreadQ7 t1 = new ThreadQ7();
		t1.setName("first");
		ThreadQ7 t2 = new ThreadQ7();
		t2.setName("second");
		ThreadQ7 t3 = new ThreadQ7();
		t3.setName("third");

		t1.start();
		t2.start();
		t3.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " :" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println(Thread.currentThread().getName() + " has finished....");
	}

}

package com.ThreadAssignment;

//16.How to create class level lock in synchronized method. Show in your code.
class Demo {
	public static synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "X" + i + "=" + (n * i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadQ16 {

	public static void main(String[] args) {

		Thread t1 = new Thread() {
			public void run() {
				Demo.printTable(2);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Demo.printTable(3);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				Demo.printTable(5);
			}
		};
		Thread t4 = new Thread() {
			public void run() {
				Demo.printTable(10);
			}
		};

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

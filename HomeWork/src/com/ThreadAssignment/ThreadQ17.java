package com.ThreadAssignment;

//17.	How to create class level lock in synchronized block. . 
//Show effect of synchronization if both threads are using different objects.
class Demo1 {
	public void printTable(int n) {
		synchronized (Demo1.class) {
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
}

public class ThreadQ17 {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		Thread t1 = new Thread() {
			public void run() {
				d1.printTable(2);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				d2.printTable(3);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				d1.printTable(5);
			}
		};
		Thread t4 = new Thread() {
			public void run() {
				d2.printTable(10);
			}
		};

		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}
}

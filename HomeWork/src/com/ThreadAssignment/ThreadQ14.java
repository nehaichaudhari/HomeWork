package com.ThreadAssignment;

//14.Show example of synchronized method in which two threads are trying to update same thread.
class SharedR {
	public synchronized void print(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
	}

	public void display(int n) {
		System.out.println(Thread.currentThread().getName() + ": ");
		for (int i = 0; i <= 10; i++) {
			System.out.println(n + "x" + i + "=" + (n * i));
		}
	}
}

public class ThreadQ14 {
	public static void main(String[] args) {
		SharedR r1 = new SharedR();
		Thread t1 = new Thread() {
			public void run() {
				r1.print(5);
				// r1.display(2);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				r1.display(6);
				// r1.print(8);
			}
		};
		t1.start();
		t2.start();
	}

}

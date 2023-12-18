package com.ThreadAssignment;

//1.Prove following statement in your code. While a thread executing static synchronized method, the remaining threads
//are not allowed to execute any static synchronized method of that class simultaneously. But remaining threads are allowed to execute the 
//following methods simultaneously 1. Normal static methods 2. Synchronized instance methods 3. Normal instance methods.
class MyDemo {
	public static synchronized void method1() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("method 1.." + Thread.currentThread().getName());
	}

	public static synchronized void method2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("method 2.." + Thread.currentThread().getName());
	}

	public static void method3() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("method 3.." + Thread.currentThread().getName());
	}

	public synchronized void method4() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("method 4.." + Thread.currentThread().getName());
	}

	public void method5() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("method 5.." + Thread.currentThread().getName());
	}
}

public class ThreadQ21 {
	public static void main(String[] args) {
		MyDemo d = new MyDemo();
		Thread t1 = new Thread() {
			public void run() {
				d.method1();
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				d.method2();
			}
		};

		Thread t3 = new Thread() {
			public void run() {
				d.method3();
			}
		};

		Thread t4 = new Thread() {
			public void run() {
				d.method4();
			}
		};

		Thread t5 = new Thread() {
			public void run() {
				d.method5();
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

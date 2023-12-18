package com.ThreadAssignment;

//19.If thread t1 is accessing static synchronized method m1, can thread t2 access synchronized method m2 at same time.
class Demo2{
	public static synchronized void method1() {
		try {
			for(int i = 1;i<=10;i++) {
				System.out.println(2 + " * "+ i + " = " + (2*i));
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public  synchronized void method2() {
		try {
			for(int i = 1;i<=10;i++) {
				System.out.println(3 + " * "+ i + " = " + (3*i));
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class ThreadQ19 {
	
	public static void main(String[] args) {
		Demo2 t = new Demo2();
		Thread t1 = new Thread() {
			public void run() {
				t.method1();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				t.method2();
			}
		};
		
		t1.start();
		t2.start();
	}

}

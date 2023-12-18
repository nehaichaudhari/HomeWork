package com.ThreadAssignment;
//9.Thread t1 prints numbers 1 to 10 . Thread t2 prints characters a to h. 
//Ensure that always characters are printed first and then numbers using join method.
public class ThreadQ9 extends Thread{
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println("Thread 1: "+i);
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(char i='a';i<='h';i++) {
					System.out.println("Thread 2: "+i);
				}
			}
		};
		
		t2.start();
			try {
				Thread.sleep(1500);
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t1.start();
	}
}

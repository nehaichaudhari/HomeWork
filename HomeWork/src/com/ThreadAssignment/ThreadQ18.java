package com.ThreadAssignment;

import java.util.ArrayList;

//18.Show use of synchronization if two threads are sharing same objects.
public class ThreadQ18 {
	ArrayList<Integer> list = new ArrayList<>();
	public synchronized void addData(int no) {
		for (int i=list.size();i<no;i++) {
			list.add(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadQ18 t = new ThreadQ18();
		Thread t1 = new Thread() {
			public void run() {
				t.addData(10);
				System.out.println(t.list);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				t.addData(20);
				System.out.println(t.list);
			}
		};
		t1.start();
		t2.start();
	}
}

package com.ThreadAssignment;

//15.Show one example of synchronized block.
class BookingSystem {
	public void movieTicketsystem() {
		synchronized (BookingSystem.class) {
			try {
				System.out.println("Welcome to booking system : " + Thread.currentThread().getName());
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadQ15 {
	public static void main(String[] args) {
		BookingSystem b = new BookingSystem();
		Thread t1 = new Thread() {
			public void run() {
				b.movieTicketsystem();
				System.out.println("Ticket booked successfully");
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				try {
					Thread.sleep(1500);
					b.movieTicketsystem();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Ticket booked successfully");
			}
		};

		t1.start();
		t2.start();
	}
}

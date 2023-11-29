package com.static_assignment;

import java.util.Scanner;

class Ticket {
	private int ticketId;
	private int price;
	static int availableTickets;
	
	/*static {
		availableTickets = 25;
	}*/
	
	{
		setAvailableTickets(25);
		price=100;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setAvailableTickets(int availableTickets) {
		if (availableTickets > 0) {
			this.availableTickets = availableTickets;
		}
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public int calculateTicketCost(int noOfTickets) {
		if (availableTickets >= noOfTickets) {
			availableTickets = availableTickets - noOfTickets;
			int totalAmount = noOfTickets * price;
			return totalAmount;
		} else {
			return -1;
		}
	}
}

public class TicketCalculation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Ticket ticket = new Ticket();

		System.out.println("Enter no of bookings: ");
		int no = sc.nextInt();

		//System.out.println("Available ticket: "+Ticket.availableTickets);
		System.out.println("Enter the available tickets: ");
		int availableTicket = sc.nextInt();
		ticket.setAvailableTickets(availableTicket);
		for(int i=0;i<no;i++) {

			System.out.println("Enter the ticketid: ");
			int ticketId = sc.nextInt();

			System.out.println("Enter the price: ");
			int price = sc.nextInt();

			System.out.println("Enter the no of tickets: ");
			int noOfTickets = sc.nextInt();

			if (noOfTickets > ticket.getAvailableTickets()) {
				System.out.println("Sorry ticket is not available ");
				
			} else {
				ticket.setTicketId(ticketId);
				ticket.setPrice(price);

				System.out.println("Available tickets: " + ticket.getAvailableTickets());
				System.out.println("Total amount: " + ticket.calculateTicketCost(noOfTickets));
				System.out.println("Available ticket after booking: " + ticket.getAvailableTickets());
			}
		}
		sc.close();
	}
}

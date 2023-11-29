package com.constructor_assignment;

public class Account {
	public long accountNo;
	public String customerName;
	
	//default constructor
	Account(){
		accountNo=2;
		customerName="seeta";
		System.out.println("I am in default constructor");
	}
	
	public static void main(String[] args) {
		Account acc = new Account();
		acc.accountNo=1;
		acc.customerName="radha";
		System.out.println("Account id is: "+acc.accountNo+"\nCustomer name is: "+acc.customerName);
		
		Account acc1 = new Account();
		acc1.accountNo=3;
		acc1.customerName="geeta";
		System.out.println(acc1);
	}

}

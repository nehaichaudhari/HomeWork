package com.covariant;
public class Bank {
	Loan provideLoan() {
		System.out.println("select loan type ");
		return new Loan();
	}
	public static void main(String[] args) {
		Bank b;
		b = new HDFC();
		Loan l1 = b.provideLoan();
		l1.type();
		
		b= new ICICI();
		Loan l2 = b.provideLoan();
		l2.type();
		
		/*Loan l;
		l=new HomeLoan();
		l.type();
		l = new CarLoan();
		l.type();
		l=new EducationLoan();
		l.type();*/
	}
}
class HDFC extends Bank{
	CarLoan provideLoan() {
		System.out.println("HDFC bank want car loan");
		return new CarLoan();
	}
}
class ICICI extends Bank{
	HomeLoan provideLoan() {
		System.out.println("ICICI bank want home loan");
		return new HomeLoan();
	}
}
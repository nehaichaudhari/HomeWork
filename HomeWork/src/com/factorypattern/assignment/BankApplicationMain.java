package com.factorypattern.assignment;

import java.util.Scanner;

public class BankApplicationMain {
	public static void main(String[] args) {
		BankFactory factory = new BankFactory();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the loan type (HomeLoan, CarLoan):");
		String loanType = sc.next();
		
		System.out.println("Enter the amount: ");
		double amount = sc.nextDouble();
		
		System.out.println("Enter the period: ");
		int period = sc.nextInt();
		
		Loan loan = factory.getLoan(loanType);
		loan.calculateEmi(amount, period);
		
		
	}

}

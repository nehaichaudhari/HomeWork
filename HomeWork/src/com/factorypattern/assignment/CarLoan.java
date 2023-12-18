package com.factorypattern.assignment;

public class CarLoan extends Loan{

	public CarLoan() {
	}
	
	@Override
	public void calculateEmi(double amount, int period) {
		intrestRate = 10.0f;
		double emi = (amount + (amount * (intrestRate/100)))/period;
		System.out.println("emi for Home loan is: "+emi);
	}
}

package com.factorypattern.assignment;

public class HomeLoan extends Loan{

	public HomeLoan() {
	}
	
	@Override
	public void calculateEmi(double amount, int period) {
		intrestRate = 8.5f;
		double emi = (amount + (amount * (intrestRate/100)))/period;
		System.out.println("emi for Home loan is: "+emi);
	}
	

}

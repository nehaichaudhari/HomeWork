package com.factorypattern.assignment;

public abstract class Loan {
	float intrestRate;
	String loanType;
	double amount;
	int period;
	
	Loan(){
		
	}
	
	public Loan(String loanType) {
		this.loanType = loanType;
	}
	
	public abstract void calculateEmi(double amount, int period);
	
}

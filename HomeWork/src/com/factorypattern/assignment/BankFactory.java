package com.factorypattern.assignment;

public class BankFactory {
	public Loan getLoan(String loanType) {
		if (loanType == null)
			return null;
		else if (loanType.equalsIgnoreCase("HomeLoan"))
			return new HomeLoan();
		else if (loanType.equalsIgnoreCase("CarLoan"))
			return new CarLoan();
		return null;
		
	}
}

package com.covariant;

public class Loan {
	Loan type() {
		String s1 = "Loan class";
		System.out.println(s1);
		//System.out.println("Type of loan: Home loan, car loan and education loan");
		return new Loan();
	}
}
class HomeLoan extends Loan{
	HomeLoan type() {
		String s1 = "Home loan class";
		System.out.println(s1);
		//System.out.println("home loan is applicable");
		return new HomeLoan();
	}
}
class CarLoan extends Loan{
	CarLoan type() {
		String s1 = "Car loan class";
		System.out.println(s1);
		//System.out.println("car loan is applicable");
		return new CarLoan();
	}
}
class EducationLoan extends Loan{
	EducationLoan type() {
		String s1 = "Education loan class";
		//System.out.println("education loan is applicable");
		return new EducationLoan();
	}
}
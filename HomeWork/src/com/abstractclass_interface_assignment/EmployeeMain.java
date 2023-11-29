package com.abstractclass_interface_assignment;

abstract class Employee{
	String name;
	int id;
	int hoursOfWork;
	
	public Employee(String name, int id, int hoursOfWork) {
		this.name=name;
		this.id=id;
		this.hoursOfWork=hoursOfWork;
	}
	
	abstract float calSalary();
}
class PartTime extends Employee{
	PartTime(String name, int id, int hoursOfWork){
		super(name, id, hoursOfWork);
	}

	@Override
	float calSalary() {
		return (hoursOfWork*200);
	}
	public String toString() {
		return "part time emp details: "+"\nname is: "+name+"\nid is: "+id+"\nhours of work: "+hoursOfWork;
	}
}
class FullTime extends Employee{
	FullTime(String name, int id, int hoursOfWork){
		super(name, id, hoursOfWork);
	}

	@Override
	float calSalary() {
		return (hoursOfWork*500);
	}
	public String toString() {
		return "full time emp details: "+"\nname is: "+name+"\nid is: "+id+"\nhours of work: "+hoursOfWork;
	}
}
public class EmployeeMain {
	public static void main(String[] args) {
		Employee e1 = new PartTime("ram", 1, 10);
		System.out.println(e1);
		float salary = e1.calSalary();
		System.out.println("part time employee salary is: "+salary);
		
		e1 = new FullTime("shyam", 2, 8);
		System.out.println(e1);
		float salary1 = e1.calSalary();
		System.out.println("full time employee salary is: "+salary1);
	}

}

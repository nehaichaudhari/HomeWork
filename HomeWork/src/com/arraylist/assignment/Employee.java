package com.arraylist.assignment;

//1.	WAP to create Emp (id,name,sal) object and add 2objects to ArrayList. 
//Sysout and see both variable memory space is printed. 
//This is because toString is not overriden but if you would have done this for Integer then 
//beautiful output would have been printed.

//2.	Now override toString for earlier assignment and now sysout and see values are printed
public class Employee {
	private int id;
	private String name;
	private int salary;

	Employee() {

	}

	Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}

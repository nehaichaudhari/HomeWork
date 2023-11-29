package com.containment_assignment;

public class Employee {
	private int empId;
	private String ename;
	private int salary;
	private Department department;
	private MyDate myDate;

	Employee() {

	}

	Employee(int empId, String ename, int salary, Department department, MyDate myDate) {
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.department = department;
		this.myDate = myDate;
	}

	// setter getter
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public MyDate getMyDate() {
		return myDate;
	}

	public void setMyDate(MyDate myDate) {
		this.myDate = myDate;
	}

	// toString
	public String toString() {
		return "\nEmployee id is: " + empId + "\nName is: " + ename + "\nsalary: " + salary + "\nDepartment details: "
				+ department + "\nDate: " + myDate;
	}

}

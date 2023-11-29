package com.collection.master.assignment;

import java.util.ArrayList;
import java.util.Collections;

class Employee2 {
	private int empId;
	private String name;

	Employee2() {

	}

	public Employee2(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
}

public class Question2 {
	public static void main(String[] args) {
		ArrayList<Employee2> alEmp = new ArrayList<Employee2>();
		Employee2 e1 = new Employee2(3, "Ajit");
		Employee2 e2 = new Employee2(4, "Suman");
		alEmp.add(e1);
		alEmp.add(e2);

		for (Employee2 emp : alEmp) {
			System.out.println(emp);
		}
		Collections.sort(alEmp, new Q2NameEmpNameComparator());
		System.out.println("------------------------------");
		for (Employee2 emp : alEmp) {
			System.out.println(emp);
		}

	}

}

package com.test;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private float salary;

	public Employee() {

	}

	public Employee(int id, String name, float salaty) {
		this.id = id;
		this.name = name;
		this.salary = salaty;
	}

	public String toString() {
		return "Employee details: " + "id is: " + id + ", name: " + name + ", salary: " + salary;
	}

	@Override
	public int compareTo(Employee e) {
		if (this.salary == e.salary)
			return this.name.compareTo(e.name);
		else if (this.salary > e.salary)
			return -1;
		else
			return 1;
	}
}

public class EmployeeMainUsingComparable {
	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "john", 15000));
		emp.add(new Employee(2, "kunal", 25000));
		emp.add(new Employee(3, "varsha", 15000));
		emp.add(new Employee(4, "roshan", 50000));
		emp.add(new Employee(5, "neha", 22000));
		
		for(Employee e:emp) {
			System.out.println(e);
		}
		System.out.println("----------------------");
		Collections.sort(emp);
		for(Employee e:emp) {
			System.out.println(e);
		}
		
	}

}

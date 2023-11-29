package com.comparable.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {
	public static void main(String[] args) {
		ArrayList<Employee> emp =new ArrayList<>();
		emp.add(new Employee(2,"john", "HR", 35, new Profile("India", "Maharashtra")));
		emp.add(new Employee(4,"kunal", "Manager", 40,new Profile("USA", "Newyork")));
		emp.add(new Employee(1,"seeta", "TL", 29,new Profile("UK", "London")));
		emp.add(new Employee(3,"rahul", "HR", 37,new Profile("India", "Delhi")));
		emp.add(new Employee(5,"rahul", "HR", 42,new Profile("Pakistan", "Punjab")));
		emp.add(new Employee(6,"akash", "HR", 26,new Profile("Shrilanka", "Colambo")));
		
		for(Employee e: emp) {
			System.out.println(e);			
		}
		System.out.println("============");
		Collections.sort(emp);
		for(Employee e: emp) {
			System.out.println(e);			
		}
	}

}

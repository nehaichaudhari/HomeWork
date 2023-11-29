package com.arraylist.assignment;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args) {
//		Employee e1 = new Employee(1,"ram",15000);
//		Employee e2 = new Employee(2,"john",14000);
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "sachin", 9000));
		list.add(new Employee(2, "john", 10000));
		list.add(new Employee(3, "kunal", 20000));
		list.add(new Employee(4, "varsha", 40000));
		System.out.println(list);
		
//		ArrayList<Integer> list1 = new ArrayList<>();
//		list1.add(5);
//		list1.add(10);
//		System.out.println(list1);
		for(int i=0;i<list.size();i++) {
			//Employee e1 = list.get(i);
			if(list.get(i).getSalary()>10000) {
				System.out.println("Emp name is: "+list.get(i).getName());
			}
		}
		
		System.out.println("Emp who have name Sachin: ");
		for(int i=0;i<list.size();i++) {
			Employee e1 = list.get(i);
			if(e1.getName().equals("sachin")) {
				System.out.println(e1);
			}
		}
		
		System.out.println("Emp who have highest number of salary: ");
		int maxVal=Integer.MIN_VALUE;
		Employee emp = null;
		for(int i=0;i<list.size();i++) {
			Employee e1 = list.get(i);
			if(e1.getSalary()>maxVal){
				maxVal=e1.getSalary();
				emp = e1;
			}
		}
		System.out.println(emp);
		
	}

}

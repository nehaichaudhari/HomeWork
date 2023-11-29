package com.collection_list_test;

import java.util.Iterator;
import java.util.LinkedList;

//1.WAP to create a LinkedList<Emp> and search for Emp 
//object whose eno=10 and delete all the records whose dept is same as  eno 10.
//Emp(int id, String name Dept d) [2M]
public class Question4 {
	static void deleteAllRecord(LinkedList<Employee> list) {
		Employee emp10 = null;
		for (Employee e : list) {
			if (e.getEmpId() == 10) {
				emp10 = e;
				break;
			}
		}
		Iterator<Employee> itr = list.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			if (emp10.getDept().deptName.equals(emp.getDept().deptName)) {
				System.out.println("deleting: "+emp);
				itr.remove();
			}
		}
		for (Employee e : list) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		LinkedList<Employee> list = new LinkedList<>();
		list.add(new Employee(10, "john", new Department(11, "IT")));
		list.add(new Employee(12, "ram", new Department(12, "HR")));
		list.add(new Employee(13, "seeta", new Department(13, "Account")));
		list.add(new Employee(14, "rina", new Department(11, "IT")));
		list.add(new Employee(15, "pratik", new Department(11, "IT")));
		deleteAllRecord(list);
	}
}

class Employee {
	private int empId;
	private String empName;
	private Department dept;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, Department dept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String setEmpName() {
		return empName;
	}

	public void getEmpName(String empName) {
		this.empName = empName;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dept=" + dept + "]";
	}
}

class Department {
	public int deptId;
	public String deptName;

	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(int deptId, String deptName) {
		this.deptId = deptId;
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}

}

package com.containment_assignment;

public class EmpDeptDateMain {
	public static void main(String[] args) {
		Department d1 = new Department(1, "IT");
		MyDate m1 = new MyDate(9, 10, 1996);
		Employee e1 = new Employee(101, "kunal", 25000, d1, m1);
		System.out.println(e1);

		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setEname("neha");
		e2.setSalary(30000);
		e2.setDepartment(new Department());
		e2.getDepartment().setId(2);
		e2.getDepartment().setName("HR");
		e2.setMyDate(new MyDate());
		e2.getMyDate().setDay(19);
		e2.getMyDate().setMonth(11);
		e2.getMyDate().setYear(1987);
		System.out.println(e2);
	}

}

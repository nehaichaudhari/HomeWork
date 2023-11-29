package com.collection.master.assignment;

import java.util.Comparator;

public class Q2NameEmpNameComparator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		return e2.getName().compareTo(e1.getName());
	}

}

package com.comparator.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparator {
	public static void main(String[] args) {
		ArrayList<Student> stud = new ArrayList<>();
		stud.add(new Student(1, "Ram", 15));
		stud.add(new Student(2, "John", 25));
		stud.add(new Student(3, "Kunal", 22));
		stud.add(new Student(1, "Ram", 35));
		stud.add(new Student(5, "Abhi", 18));

		// for roll no
		for (Student s : stud) {
			System.out.println(s);
		}
		System.out.println("--------------------------");
		Collections.sort(stud, new RollNoComparator());
		for (Student s : stud) {
			System.out.println(s);
		}

		// sort on basis of name
		System.out.println("-----------on basis of name------------------");
		Collections.sort(stud, new NameComparator());
		for (Student s : stud) {
			System.out.println(s);
		}

		// sort on basis of age
		System.out.println("-----------on basis of age------------------");
		Collections.sort(stud, new AgeComparator());
		for (Student s : stud) {
			System.out.println(s);
		}

	}

}

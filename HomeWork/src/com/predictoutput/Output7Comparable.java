package com.predictoutput;

import java.util.ArrayList;
import java.util.Collections;

public class Output7Comparable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "XYZ");
		Student s2 = new Student(2, "ABC");
		Student s3 = new Student(3, "AAA");
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Collections.sort(al);
		System.out.println(al);
	}
}

class Student implements Comparable<Student> {
	int id;
	String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return -1;
	}

	public String toString() {
		return ("id " + this.id + " name " + this.name);
	}
}

package com.set.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.sun.tools.javac.resources.compiler;

public class StudentCourseHashSet {
	// question 1
	static void countCourseName(HashSet<Student> hs) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (Student s : hs) {
			String course = s.getCourse().getCname();
			if (hm.containsKey(course)) {
				hm.put(course, hm.get(course) + 1);
			} else {
				hm.put(course, 1);
			}
		}
		System.out.println(hm);
	}

	// question 2
	static void feeStatus(HashSet<Student> hs) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("feespaid",0);
		map.put("feesnotpaid",0);
		
		Iterator<Student> itr2 = hs.iterator();
		while (itr2.hasNext()) {
			Student stud = itr2.next();
			if (stud.getCourse().getFees() == stud.getFeesPaid()) {
				map.put("feespaid", map.get("feespaid")+1);
			} else {
				map.put("feesnotpaid", map.get("feesnotpaid")+1);
			}
		}
		System.out.println("Result: "+ map);
		
	}

	// question 3
	static void courseStudent(HashSet<Student> hs) {
		HashMap<Course, ArrayList<String>> map = new HashMap<>();

		Iterator<Student> itr = hs.iterator();
		while (itr.hasNext()) {
			Student stud = itr.next();
			Course course = stud.getCourse();
			if(map.containsKey(course)) {
				ArrayList<String> studList = new ArrayList<>();
				studList.add(stud.getSname());
				map.put(course, studList);			
			}else {
				ArrayList<String> studList = new ArrayList<>();
				studList.add(stud.getSname());
				map.put(course, studList);
			}
			
		}
		for(Map.Entry<Course, ArrayList<String>> e : map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

	public static void main(String[] args) {
		HashSet<Student> stud = new HashSet<>();
		stud.add(new Student(1, "ram", 34, 25000, new Course(101, "java", 25000)));
		stud.add(new Student(2, "shyam", 31, 12000, new Course(102, ".net", 15000)));
		stud.add(new Student(3, "kunal", 56, 13000, new Course(103, ".net", 13000)));
		stud.add(new Student(4, "pratik", 29, 19000, new Course(104, "angular", 20000)));

		for (Student s : stud) {
			System.out.println(stud);
		}
		System.out.println("-----------------------");
		for (Student s : stud) {
			if (s.getFeesPaid() == s.getCourse().getFees()) {
				if (s.getMarks() > 30 && s.getMarks() < 35) {
					// s.setMarks(35);
					int diff = 35 - s.getMarks();
					int newMarks = s.getMarks() + diff;
					s.setMarks(newMarks);
				}
			}
		}
		for (Student s1 : stud) {
			System.out.println(s1);
		}
		System.out.println("-----------------------");
		countCourseName(stud);

		feeStatus(stud);
		
		System.out.println("--------------------");
		courseStudent(stud);

	}
}

package com.set.assignment;

import java.util.TreeSet;

//14.WAP to create a reverse order view of the elements contained in a given TreeSet.
public class Question14 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(10);
		ts.add(25);
		ts.add(12);
		ts.add(5);
		System.out.println(ts);
		System.out.println(ts.descendingSet());
	}

}

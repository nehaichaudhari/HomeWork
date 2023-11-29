package com.set.assignment;

import java.util.TreeSet;

//10.WAP to create a new TreeSet, add Strings and print the TreeSet.
public class Question10 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("orange");
		ts.add("mango");
		ts.add("pinapple");
		ts.add("strwaberry");
		ts.add("apple");
		
		System.out.println(ts);
	}

}

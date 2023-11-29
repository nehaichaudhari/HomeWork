package com.set.assignment;

import java.util.TreeSet;
//13.WAP to get the number of elements in a TreeSet.
public class Question13 {
	public static void main(String[] args) {
		TreeSet<String> ts  = new TreeSet<>();
		ts.add("black");
		ts.add("white");
		ts.add("red");
		ts.add("blue");
		ts.add("green");
		System.out.println(ts);
		System.out.println(ts.size());
	}
}

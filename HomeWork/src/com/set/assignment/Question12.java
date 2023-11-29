package com.set.assignment;

import java.util.TreeSet;

//12.WAP to get the first and last elements in a TreeSet.
public class Question12 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("orange");
		ts.add("lemon");
		ts.add("apple");
		ts.add("pinapple");
		ts.add("mango");
		
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
	}

}

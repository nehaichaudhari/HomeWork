package com.set.assignment;

import java.util.TreeSet;

//16.WAP to retrieve and remove the lowest element of a TreeSet using a single method call.
//Repeat the same using 2 different method calls.
public class Question16 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("black");
		ts.add("white");
		ts.add("pink");
		ts.add("purple");
		ts.add("yellow");
		System.out.println(ts);
		System.out.println(ts.pollLast());
		
	}

}

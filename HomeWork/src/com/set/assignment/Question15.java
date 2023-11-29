package com.set.assignment;

import java.util.TreeSet;

//15.WAP to remove a given element from a TreeSet.
public class Question15 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("black");
		ts.add("white");
		ts.add("pink");
		ts.add("purple");
		ts.add("yellow");
		
		System.out.println(ts);
		String word = "black";
		ts.remove(word);
		System.out.println(ts);
	}

}

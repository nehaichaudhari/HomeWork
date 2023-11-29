package com.set.assignment;

import java.util.Iterator;
import java.util.TreeSet;

//11.WAP to iterate through all elements in a TreeSet.
public class Question11 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("orange");
		ts.add("lemon");
		ts.add("apple");
		ts.add("pinapple");
		ts.add("mango");
		
		//1st way
		System.out.println("--------1st way----------");
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//2nd way
		System.out.println("--------2nd way----------");
		for(String s : ts) {
			System.out.println(s);
		}
	}
}

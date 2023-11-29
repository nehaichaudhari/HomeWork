package com.set.assignment;

import java.util.HashSet;
import java.util.TreeSet;

public class Question9 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		System.out.println(hs.isEmpty());
		hs.add("black");
		hs.add("red");
		hs.add("white");
		hs.add("pink");
		
		//1st way
		TreeSet<String> ts = new TreeSet<>(hs);
		System.out.println(ts);
		
		//2nd way
		ts.addAll(hs);
		System.out.println(ts);
	}

}

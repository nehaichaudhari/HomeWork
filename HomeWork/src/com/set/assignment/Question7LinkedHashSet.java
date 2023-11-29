package com.set.assignment;

import java.util.LinkedHashSet;

//7.WAP to test if a LinkedHashSet is empty or not.
public class Question7LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> hs  = new LinkedHashSet<>();
		System.out.println(hs.isEmpty());
		hs.add("java");
		hs.add("c");
		hs.add("c++");
		hs.add("angular");
		hs.add("python");
		
		System.out.println(hs.isEmpty());
	}

}

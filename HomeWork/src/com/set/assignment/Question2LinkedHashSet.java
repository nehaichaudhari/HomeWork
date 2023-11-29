package com.set.assignment;
//2.	WAP to create a LinkedHashSet with some colors (String) using generics
import java.util.LinkedHashSet;

public class Question2LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> ls = new LinkedHashSet<>();
		ls.add("white");
		ls.add("red");
		ls.add("pink");
		ls.add("black");
		ls.add("yellow");
		ls.add("green");
		
		System.out.println(ls);
	}

}

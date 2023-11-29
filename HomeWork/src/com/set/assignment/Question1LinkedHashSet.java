package com.set.assignment;
//1.	WAP to create a LinkedHashSet with Integer objects without using generics
import java.util.LinkedHashSet;

public class Question1LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet<>();
		ls.add(15);
		ls.add(10);
		ls.add(2);
		ls.add(20);
		
		System.out.println(ls);
	}

}

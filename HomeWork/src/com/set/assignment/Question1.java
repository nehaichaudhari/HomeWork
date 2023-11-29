package com.set.assignment;
//1.	WAP to create a HashSet with Integer objects without using generics
import java.util.HashSet;

public class Question1 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(15);
		hs.add(10);
		hs.add(5);
		hs.add(9);
		System.out.println(hs);
	}

}

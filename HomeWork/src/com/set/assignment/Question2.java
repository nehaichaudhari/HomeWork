package com.set.assignment;
//2.	WAP to create a HashSet with some colors (String) using generics
import java.util.HashSet;

public class Question2 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("black");
		hs.add("white");
		hs.add("blue");
		hs.add("red");
		hs.add("pink");
		
		System.out.println(hs);
	}

}

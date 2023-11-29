package com.set.assignment;
//7.WAP to test if a HashSet is empty or not.
import java.util.HashSet;

public class Question7 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		System.out.println(hs.isEmpty());
		hs.add("black");
		hs.add("red");
		hs.add("white");
		hs.add("pink");
		
		System.out.println(hs.isEmpty());		
	}

}

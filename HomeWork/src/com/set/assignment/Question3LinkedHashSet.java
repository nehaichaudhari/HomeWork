package com.set.assignment;
//3.	WAP to create a LinkedHashSet from an ArrayList
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Question3LinkedHashSet {
	public static void main(String[] args) {
		ArrayList<String> al =  new ArrayList<>();
		al.add("black");
		al.add("red");
		al.add("white");
		al.add("pink");
		
		LinkedHashSet<String> hs = new LinkedHashSet<>(al);
		System.out.println(hs);
		
		//2nd way
		LinkedHashSet<String> hs1 = new LinkedHashSet<>();
		hs1.addAll(al);
		System.out.println(hs1);
	}

}

package com.set.assignment;
//3.	WAP to create a HashSet from an ArrayList
import java.util.ArrayList;
import java.util.HashSet;

public class Question3 {
	public static void main(String[] args) {
		ArrayList<String> al =  new ArrayList<>();
		al.add("black");
		al.add("red");
		al.add("white");
		al.add("pink");
		
		HashSet<String> hs = new HashSet<>(al);
		System.out.println(hs);
		
		//2nd way
		HashSet<String> hs1 = new HashSet<>();
		hs1.addAll(al);
		System.out.println(hs1);
	}

}

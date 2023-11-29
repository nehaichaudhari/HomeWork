package com.arraylist.assignment;

import java.util.ArrayList;

//15.What is the difference between ArrayList’s overloaded remove() methods?
public class AdditionalQuestion15 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("python");
		al.add("angular");
		al.add("html");
		System.out.println(al.remove(2));
		System.out.println(al.remove("html"));
		System.out.println(al);
	}

}

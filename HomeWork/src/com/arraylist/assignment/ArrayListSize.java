package com.arraylist.assignment;

import java.util.ArrayList;

//1.Show in program, that size of an arraylist dynamically changes
public class ArrayListSize {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.size());
		al.add(15);
		al.add(96);
		al.add(36);
		al.add(45);
		System.out.println(al.size());
	}

}

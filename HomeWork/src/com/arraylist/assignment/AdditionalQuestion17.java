package com.arraylist.assignment;

import java.util.ArrayList;
import java.util.Collections;

//17.How to reverse an ArrayList in Java?
public class AdditionalQuestion17 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(7);
		al.add(8);
		Collections.reverse(al);
		System.out.println(al);
	}
}

package com.arraylist.assignment;

import java.util.ArrayList;

//4.Create array list of 10 integers. Insert an element at 7th position.
public class AdditionalQuestion4 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(6, 50);
		System.out.println(al);
	}
}

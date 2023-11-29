package com.arraylist.assignment;

import java.util.ArrayList;

//2.Create array list of integers. Add first 50 odd numbers to arraylist.
public class AddOddNoToArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				al.add(i);
			}
		}
		for (Integer in : al) {
			System.out.println(in);
		}
	}
}

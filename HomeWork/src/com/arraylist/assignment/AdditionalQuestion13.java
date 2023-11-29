package com.arraylist.assignment;

import java.util.ArrayList;

//13.Does ArrayList allow Null values - yes null values is allow
public class AdditionalQuestion13 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(null);
		al.add(5);
		System.out.println(al);
	}

}

package com.arraylist.assignment;

import java.util.ArrayList;

//8.	Sort array list of Strings.
public class AdditionalQuestion8 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("black");
		al.add("white");
		al.add("purple");
		al.add("red");
		al.add("brown");
		// Collections.sort(al);
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).compareTo(al.get(j)) >= 1) {
					String temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
		System.out.println(al);
	}

}

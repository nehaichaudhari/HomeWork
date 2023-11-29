package com.arraylist.assignment;

import java.util.ArrayList;

//16.If an ArrayList contains duplicate objects and remove() method is 
//invoked on the same object, will itremove the duplicates?
public class AdditionalQuestion16 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("apple");
		al.remove("apple");
		System.out.println(al);
	}
}

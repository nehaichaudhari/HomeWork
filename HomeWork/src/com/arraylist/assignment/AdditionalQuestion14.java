package com.arraylist.assignment;

import java.util.ArrayList;

//14.What is the difference between ArrayListclear() and removeAll() methods?
public class AdditionalQuestion14 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("mango");
		al.add("apple");
		al.add("orange");
		al.add("strwberry");
		
		ArrayList<String> list = new ArrayList<>();
		list.add("mango");
		list.add("apple");
		//al.clear();
		System.out.println(al);
		System.out.println(al.removeAll(list));
		
	}
}

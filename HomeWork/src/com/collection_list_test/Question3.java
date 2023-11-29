package com.collection_list_test;

import java.util.ArrayList;
import java.util.Iterator;

//3.Write a code that shows Iterator is fail fast. [1M]
public class Question3 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("mango");
		al.add("apple");
		al.add("orange");
		al.add("banana");
		
		Iterator<String> itr = al.iterator();
		al.add("kiwi");
		while(itr.hasNext()) {
			itr.next();
			itr.remove();
		}
		System.out.println(al);
	}
}

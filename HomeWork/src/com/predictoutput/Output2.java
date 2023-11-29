package com.predictoutput;

import java.util.HashSet;
import java.util.LinkedList;

class Country {
	private String name;

	Country(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}

public class Output2 {
	public static void main(String[] args) {
		HashSet mySet = new HashSet();
		String s1 = new String("Chicago");
		String s2 = new String("Chicago");
		Country s3 = new Country("USA");
		Country s4 = new Country("USA");
		mySet.add(s1);
		mySet.add(s2);
		mySet.add(s3);
		mySet.add(s4);
		System.out.println(mySet);
	}
}

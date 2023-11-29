package com.map.assignment;

import java.util.HashMap;

//3.	WAP to add elements to a HashMap using generics with Integer as Key and String as value. And 4 key-value Map.Entry
public class Question3 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(2, "java");
		map.put(1, "c");
		map.put(5, "c++");
		map.put(4, "html");
		map.put(3, "python");
		
		System.out.println(map.entrySet());
	}

}

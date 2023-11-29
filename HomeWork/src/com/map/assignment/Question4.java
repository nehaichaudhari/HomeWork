package com.map.assignment;

import java.util.HashMap;

//4.	WAP to create a map using Wrapper class as key 
//and value same as keys’ data type WAP to count the number of key-value (size) mappings in a map.
public class Question4 {
	public static void main(String[] args) {
		HashMap<Character, Character> map = new HashMap<>();
		map.put('A', 'a');
		map.put('B', 'b');
		map.put('C', 'c');
		map.put('D', 'd');
		map.put('E', 'e');
		
		System.out.println(map.size());
	}
}

package com.map.assignment;

import java.util.ArrayList;
import java.util.HashMap;

//2.	WAP add elements to HashMap without using generics, 
//0th location use String as key and Integer as value, on 1st location use String as key String and Integer as value.
public class MapWithoutGeneric2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		ArrayList al = new ArrayList();
		
		al.add("c++");
		al.add(25);
		
		map.put("java", 15);
		map.put("angular", al);
		System.out.println(map);
	}
}

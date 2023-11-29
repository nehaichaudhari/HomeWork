package com.map.assignment;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//5.	WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
public class Question5 {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("java", 11);
		map.put("c++", 22);
		map.put("angular", 33);
		map.put("java", 11);
		map.put("c++", 22);
		
		for(Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
		//6.	WAP to get only the Keys from a HashMap
		
		Set<String> keys = map.keySet();
		for(String ent : keys) {
			System.out.println("keys are: "+ent);
		}
		
		//7.	WAP to get only the Values from a HashMap
		
		Collection<Integer> val = map.values();
		for(Integer i : val) {
			System.out.println("val are: "+i);
		}
	}

}

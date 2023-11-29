package com.map.assignment;

//12.	WAP to create a Map which stores another Map as a value.
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question12 {
	public static void main(String[] args) {
		HashMap<Integer, HashMap<String, Integer>> hm = new HashMap<>();
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("ram", 15);
		hm1.put("shyam", 56);

		HashMap<String, Integer> hm2 = new HashMap<>();
		hm2.put("seeta", 17);
		hm2.put("geeta", 82);
		
		hm.put(101, hm1);
		hm.put(102, hm1);
		hm.put(103, hm2);
		hm.put(104, hm2);

		// 13. WAP to iterate the elements in the Map stored in the above Map
		for (Entry<Integer, HashMap<String, Integer>> entries : hm.entrySet()) {
			HashMap<String, Integer> value = entries.getValue();
			System.out.print(entries.getKey()+"  ");
			for (Map.Entry<String, Integer> e : value.entrySet()) {
				System.out.print(e.getKey()+" = "+ e.getValue()+" ");
			}
			System.out.println();
		}
	}

}

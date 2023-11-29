package com.map.assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

//17.	WAP to get a key-value mapping associated with the greatest key strictly less than the given key. 
//Return null if there is no such key
public class Question17 {
	static Map<Integer, String> mapMethod(HashMap<Integer, String> hm) {
		int key = 3;
		HashMap<Integer, String> map2 = new HashMap<>();
		for (Entry<Integer,String> entry: hm.entrySet()) {
			int k1 = entry.getKey();
			if (k1<key) {
				map2.put(entry.getKey(), entry.getValue());
			}
		}
		if (map2.isEmpty())
			return null;
		else
			return map2;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "madhu");
		hm.put(2, "harshu");
		hm.put(3, "gauri");
		hm.put(4, "shivani");
		hm.put(5, "shraddha");
		System.out.println(hm);

		System.out.println(mapMethod(hm));
	}
}

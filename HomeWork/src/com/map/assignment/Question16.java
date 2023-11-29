package com.map.assignment;

//16.WAP to get the least key strictly greater than the given key. Return null if there is no such key
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Question16 {
	static Map<Integer, String> mapMethod(HashMap<Integer, String> hm) {
		int key = 3;
		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			if (itr.next().getKey() <= key) {
				itr.remove();
			}
		}
		return hm.isEmpty() ? null : hm;
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

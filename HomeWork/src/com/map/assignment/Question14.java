package com.map.assignment;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

///14.	WAP to get the portion of a HashMap whose keys are strictly less than a given key
public class Question14 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "madhu");
		hm.put(2, "harshu");
		hm.put(3, "gauri");
		hm.put(4, "shivani");
		hm.put(5, "shraddha");
		System.out.println(hm);

		int key = 3;
		Set<Entry<Integer, String>> entries = hm.entrySet();
		for (Entry<Integer, String> e : entries) {
			if (e.getKey() < key) {
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
		
		//15.WAP to get the portion of this HashMap whose keys are less than (or equal to, if inclusive is true) a given key
		int keys =4;
		System.out.println("---------------------");
		for(Entry<Integer, String> e : entries) {
			if(e.getKey()<=keys) {
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
	}

}

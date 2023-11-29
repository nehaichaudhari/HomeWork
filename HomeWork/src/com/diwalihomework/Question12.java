package com.diwalihomework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Question12 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(6, "six");
		hm.put(7, "seven");
		hm.put(8, "eight");
		hm.put(9, "nine");
		hm.put(10, "ten");
		
//		for(Map.Entry<Integer, String> e : hm.entrySet()) {
//			if(e.getKey()/3==0) {
//				hm.remove(e.getKey());
//				System.out.println(e.getKey()+" "+e.getValue());
//			}
//		}
		
		Iterator<Entry<Integer, String>> iterator = hm.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			if(entry.getKey()%3==0) {
				iterator.remove();
			}
		}
		System.out.println(hm);
	}

}

package com.map.assignment;

import java.util.HashMap;

//		WAP to add elements to a HashMap without using generics (ie do not use <>) 
//		and print content of it. Use Integer as Key and String as Value. 
//		In second HashMap add elements of String type as Key and Integer as Value.
public class MapWithoutGeneric {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "ram");
		hm.put("shyam", 5);
		hm.put('c', 15);

		System.out.println(hm);
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("java", 68);
		hm1.put("java", 68);
		hm1.put(".net", 68);
		hm1.put("python", 56);
		hm1.put("angular", 89);
		System.out.println(hm1);
	}

}

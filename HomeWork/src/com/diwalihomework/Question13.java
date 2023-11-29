package com.diwalihomework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Question13 {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, "black");
		hmap.put(2, "white");
		hmap.put(3, "yellow");
		hmap.put(4, "red");
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<String> al2=new ArrayList<>();
		for(Map.Entry<Integer, String> e: hmap.entrySet()) {
			al.add(e.getKey());
			al2.add(e.getValue());
		}
		System.out.println(al);
		System.out.println(al2);
	}

}

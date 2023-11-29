package com.predictoutput;

import java.util.HashSet;
import java.util.Iterator;

public class Output6 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Rose");
		hashSet.add("Lotus");
		hashSet.add("Lavender");
		
		Iterator itr = hashSet.iterator();
		//hashSet.add("Tulip");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

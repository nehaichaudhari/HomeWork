package com.diwalihomework;

import java.util.HashSet;
import java.util.Iterator;

public class Question11 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Monday");
		hs.add("Tuesday");
		hs.add("Wednesday");
		hs.add("Thursday");
		hs.add("Friday");
		hs.add("Saturday");
		hs.add("Sunday");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			if(value.equals("Saturday") || value.equals("Sunday")) {
				itr.remove();
			}
		}
		System.out.println(hs);
	}
}

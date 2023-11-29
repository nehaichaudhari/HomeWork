package com.set.assignment;

import java.util.HashSet;
import java.util.Iterator;
//5.WAP to get the number of elements in a HashSet.
public class Question5and6 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("black");
		hs.add("red");
		hs.add("white");
		hs.add("pink");
		
		System.out.println(hs.size());
	//6.WAP to empty a HashSet.
//		Iterator<String> itr = hs.iterator();
//		while(itr.hasNext()) {
//			itr.next();
//			itr.remove();
//		}
		hs.clear();
		System.out.println(hs);
	}

}

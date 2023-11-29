package com.set.assignment;

import java.util.HashSet;
import java.util.Iterator;

public class Question4 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(5);
		hs.add(9);
		hs.add(4);
		//1st way
		for(Integer i : hs) {
			System.out.print(i+" ");
		}
		System.out.println("\n------------------");
		//2nd way
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
}

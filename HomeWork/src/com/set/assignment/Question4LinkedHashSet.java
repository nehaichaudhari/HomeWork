package com.set.assignment;
//4.WAP to iterate through all elements in a LinkedHashSet and print the elements. Observe the order of elements.
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question4LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
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

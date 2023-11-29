package com.set.assignment;
//5.WAP to get the number of elements in a LinkedHashSet.
import java.util.LinkedHashSet;

public class Question5And6LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("black");
		hs.add("red");
		hs.add("white");
		hs.add("pink");
		
		System.out.println(hs.size());
	//6.WAP to empty a LinkedHashSet.
//		Iterator<String> itr = hs.iterator();
//		while(itr.hasNext()) {
//			itr.next();
//			itr.remove();
//		}
		hs.clear();
		System.out.println(hs);
	}

}

package com.set.assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HWQuestion1 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		System.out.println(hs.isEmpty());
		hs.add("black");
		hs.add("red");
		hs.add("white");
		hs.add("pink");
		
		System.out.println("-------1st way-------");
		Object arr[] = hs.toArray();
		System.out.println(Arrays.toString(arr));
		
		System.out.println("-------2nd way-------");
		String arr1[] = new String[hs.size()];
		Iterator<String> itr = hs.iterator();
		int i = 0;
		while(itr.hasNext()) {
			arr1[i]=itr.next();
			i++;
		}
		System.out.println(Arrays.toString(arr1));
	}

}

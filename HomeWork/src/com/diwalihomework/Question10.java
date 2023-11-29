package com.diwalihomework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question10 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(15);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(05);
		System.out.println("before: "+al);
		Collections.sort(al, new ReverseComparator());
//		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}
	static class ReverseComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return o2.compareTo(o1);
		}
		
	}
}


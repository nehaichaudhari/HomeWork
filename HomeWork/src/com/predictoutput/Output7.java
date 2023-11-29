package com.predictoutput;

import java.util.HashMap;

public class Output7 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "India");
		map.put(2, "Ausralia");
		System.out.println(map.put(1, "London"));
	}
}


//a. Hashtable is synchronized. - true
//b. Treeset maintains insertion order. - false
//c. Linked hashset can contain multiple null values. - false
//d. Treemap of integer is sorted by default natural order of its values. - false
//e. Iterator is fail safe. - false
//f. Comparable interface has 2 methods. One of them is equals method. - false
//g. Insertion and deletion in the middle is faster in arraylist than linked list. - false
//h. Vector is thread safe. - true
package com.collection.master.assignment;

import java.util.HashMap;

public class Q4MapTest {
	public static void main(String[] args) {
		HashMap obj = new HashMap();
		obj.put("A", new Integer(1));
		obj.put("B", new Integer(2));
		obj.put("A", new Integer(4));
		obj.put("C", new Integer(3));
		System.out.println(obj); // Justify
	}
}

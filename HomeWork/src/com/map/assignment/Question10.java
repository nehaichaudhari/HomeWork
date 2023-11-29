package com.map.assignment;

//10.	WAP to create a map which stores an arraylist as a value
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Question10 {
	public static void main(String[] args) {
		HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
		ArrayList<String> al = new ArrayList<>();
		al.add("black");
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("white");
		al1.add("yellow");

		hm.put(1, al);
		hm.put(2, al1);
		// 11. WAP to iterate the elements in the arraylist stored in the above Map.
		for (Entry<Integer, ArrayList<String>> e : hm.entrySet()) {
			int key = e.getKey();
			ArrayList<String> value = e.getValue();
			Iterator<String> itr1 = value.iterator();
			System.out.print(key+" = ");

			while (itr1.hasNext()) {
				System.out.print(itr1.next() + " ");
			}
			System.out.println();
		}
	}
//	1 {black}, 2{white, yellow}

}

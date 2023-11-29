package com.arraylist.assignment;

import java.util.ArrayList;
import java.util.Iterator;

//3.Create array list of string. Add 7 days to list ( Monday , Sunday etc) 
//Remove elements from list for which string length is more than 7
public class AdditionalQuestion3 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Monday");
		al.add("Tuesday");
		al.add("Wednesday");
		al.add("Thursday");
		al.add("Friday");
		al.add("Saturday");
		al.add("Sunday");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			if(value.length()>7) {
				itr.remove();
			}
		}
		System.out.println(al);
	}

}

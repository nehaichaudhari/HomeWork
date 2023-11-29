package com.arraylist.assignment;

import java.util.ArrayList;

public class RemoveArrayLenLessThanSeven {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("monday");
		list.add("tuesday");
		list.add("wednesday");
		list.add("thursday");
		list.add("friday");
		list.add("saturday");
		list.add("sunday");
		
		for(int i=list.size()-1;i>=0;i--) {
			String str = list.get(i);
			if(str.length()>7) {
				list.remove(str);
			}
		}
		System.out.println(list);
	}

}

package com.arraylist.assignment;

import java.util.ArrayList;
//15.	WAP to search the specified collection in this collection
public class SearchSpecificCollection {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(33);
		list1.add(22);
		
		boolean flag=false;
		for(int i=0;i<list1.size();i++) {
			flag = false;
			for(int j=0;j<list.size();j++) {
				if(list1.get(i)==list.get(j)) {
					flag = true;
				}
			}
			if(!flag) {
				System.out.println("list not contain");
				break;
			}
		}
		if(flag==true) {
			System.out.println("list containt");
		}
	}

}

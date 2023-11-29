package com.arraylist.assignment;
//WAP to convert collection into array
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertCollectionIntoArray {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(25);
		list.add(65);
		
		int intarr[]=new int[3];
		
		for(int i=0;i<list.size();i++) {
			intarr[i]=list.get(i);
		}
		System.out.println(Arrays.toString(intarr));
		System.out.println(Arrays.toString(list.toArray()));
	}

}

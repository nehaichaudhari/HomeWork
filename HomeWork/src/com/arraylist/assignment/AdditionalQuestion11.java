package com.arraylist.assignment;

import java.util.ArrayList;

//11.	Create arraylist ‘arrList’ within an arraylist. 
//Use contains and containsall method to check if given element and arraylists are present in ‘arrList’
public class AdditionalQuestion11 {
	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(6);
		arrList.add(10);
		arrList.add(12);
		arrList.add(25);
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(6);
		al.add(10);
		al.add(12);
		System.out.println(al.contains(6));
		System.out.println(arrList.containsAll(al));
	}

}

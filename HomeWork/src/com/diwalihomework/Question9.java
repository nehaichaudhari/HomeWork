package com.diwalihomework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Show in example how to convert arraylist to array and array to arraylist.
public class Question9 {
	public static void main(String[] args) {
		Integer arr[] = { 11, 12, 13 };

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(12);
		al.add(3);
		al.add(1);
		al.add(6);

		// 1st way - array - arraylist
		System.out.println("1st way: " + Arrays.asList(arr));

		// 2nd way
		System.out.println("2nd way: " + List.of(arr));

		// 3nd way
		ArrayList<Integer> al2 = new ArrayList<>();
		for (int a : arr) {
			al2.add(a);
		}
		System.out.println("3rd way: " + al2);

		// arraylist to array conversion
		// 1st way
		Integer arr2[] = new Integer[al.size()];
		arr2 = al.toArray(arr2);
		for (Integer i : arr2) {
			System.out.println(i);
		}

		// 2nd way
		int arrNew[] = new int[al.size()];
		int i=0;
		for (Integer al4 : al) {
			arrNew[i++]=al4;
		}
		System.out.println(Arrays.toString(arrNew));
	}
}

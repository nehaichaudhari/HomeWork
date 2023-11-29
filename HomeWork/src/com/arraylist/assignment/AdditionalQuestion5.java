package com.arraylist.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//5.Create array list of characters. 
//Remove duplicate characters from the list. E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}
//Output should be {‘d’ , ‘g’ , ‘h’}
public class AdditionalQuestion5 {
	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<>();
		al.add('d');
		al.add('g');
		al.add('h');
		al.add('d');
		al.add('d');
		al.add('h');
		al.add('g');
		ArrayList<Character> temp = new ArrayList<>();
		Iterator<Character> itr = al.iterator();
		while(itr.hasNext()) {
			Character ch = itr.next();
			if (temp.contains(ch)) {
				itr.remove();
			}
			else {
				temp.add(ch);
			}
		}
//		while(itr.hasNext()) {
//			Character ch = itr.next();
//			System.out.println(ch +" " + Collections.frequency(al, ch));
//			if (Collections.frequency(al,  ch)> 1) {
//				itr.remove();
//			}
//		}
		System.out.println(al);
	}
}

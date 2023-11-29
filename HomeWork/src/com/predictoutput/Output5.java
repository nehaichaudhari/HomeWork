package com.predictoutput;

import java.util.HashSet;

public class Output5 {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Rose");
		hashSet.add("Lotus");
		hashSet.add("Lavender");
		System.out.println(hashSet.add("Rose"));
		System.out.println(hashSet);
	}
}

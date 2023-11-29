package com.predictoutput;

public class Simple {

	public static void method(int i) {
		System.out.println(i);
	}

	public static void method(double d) {
		System.out.println(d);
	}

	public static void main(String[] args) {

		method('a');//no method for char , print ascii value

		method(2);//int i

		method(2.0f);//double d

	}

}

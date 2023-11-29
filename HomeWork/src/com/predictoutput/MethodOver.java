package com.predictoutput;

public class MethodOver {
	public void printParam(long l, double d) {
		System.out.println("long + double");
	}

	/*public void printParam(double i, long i1) {
		System.out.println("double + long");
	}*/

	public static void main(String[] args) {
		MethodOver m = new MethodOver();
		m.printParam(10, 20);//get confused which method will call as int will convert to both double and long

	}

}

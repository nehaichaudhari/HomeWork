package com.abstractclass_interface_assignment;

abstract class Equipment {
	void fill() {
		System.out.println("in fill method");
	}

	abstract void mix();
}

class CementMixer extends Equipment {

	@Override
	void mix() {
		System.out.println("in mix method");
	}

	void pour() {
		System.out.println("in pour method");
	}
}

public class Question5 {
	public static void main(String[] args) {
		CementMixer c1 = new CementMixer();
		c1.fill();
		c1.mix();
		c1.pour();
		
		Equipment e = new CementMixer();
		e.fill();
		e.mix();
		//e.pour(); // this method is not overridden thats why it is not allow 
	}
}

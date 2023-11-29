package com.static_final_assignment;

public class Program12 {

}

class Parent {
	private void method1() {
	}
}

class Child extends Parent {
	public void method2() {
		//method1(); //private method of parent class can not be inherited
	}
}
package com.access_specifiers_assignment;

public class Student {
	private int rollNo;
	int admissionNo;
	protected int age;
	public int courseId;
	
	public void doPublic() {
		System.out.println("in public method");
	}
	
	void doDefault() {
		System.out.println("in default method");
		
	}
	
	protected void doProtected() {
		System.out.println("in protected method");
		
	}
	
	private void dpPrivate() {
		System.out.println("in private method");
	}

}

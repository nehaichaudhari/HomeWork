package com.containment_assignment;

public class Department {
	private int id;
	private String name;
	
	Department(){
		
	}
	
	Department(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "\nDepartment id is: "+id+"\ndepartment name is: "+name;
	}

}

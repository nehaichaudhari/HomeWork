package com.abstractclass_interface_assignment;
class PhoneBook{
	public String name = "rohan";
	public int phoneNo;
	{
		name = "radha";
	}
	
	public PhoneBook() {
		// TODO Auto-generated constructor stub
	}
	
	public PhoneBook(String name, int phoneNo){
		this.name=name;
		this.phoneNo = phoneNo;
	}
}
public class Question1 {
	public static void main(String[] args) {
		PhoneBook phoneBook = new PhoneBook("sanjay", 123456);
		System.out.println("name is: "+phoneBook.name);
		System.out.println("phone is: "+phoneBook.phoneNo);
	}
}

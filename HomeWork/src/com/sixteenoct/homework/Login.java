package com.sixteenoct.homework;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user name: ");
		String userName = sc.nextLine();
		System.out.println("Enter the password: ");
		String password = sc.nextLine();
		
		User u1 = new User(userName, password);
		u1.validatePassword();
		sc.close();
	}
}
class User{
	String userName;
	String password;
	
	User(){
		
	}
	
	User(String userName,String password){
		this.userName=userName;
		this.password=password;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	boolean checkNoPresentInPassword() {
		boolean flag = false;
		for(int i=0; i<=9;i++) {
			if(password.contains(""+i)) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	boolean checkUpperCase() {
		boolean flag=false;
		for(int i=0;i<password.length();i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	void validatePassword() {
		if(password.length()<8) {
			System.out.println("Password must be 8 characters long");
		}
		if(!(password.contains("@") || password.contains("#"))) {
			System.out.println("at least one special @ or # character must be present");
		}
		if(checkNoPresentInPassword()==false) {
			System.out.println("Password must contains at least one digit");
		}
		if(password.contains(" ")) {
			System.out.println("Password must not have spaces");
		}
		if(checkUpperCase()==false) {
			System.out.println("Password must have at least one upper case letter");
		}
	}
	
}
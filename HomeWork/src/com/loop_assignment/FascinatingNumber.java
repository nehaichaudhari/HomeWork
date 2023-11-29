package com.loop_assignment;

import java.util.Scanner;

//192 = 192*2=384    192*3=576
public class FascinatingNumber {
	static void checkFascinatingNo(int no) {
		String str = "";
		int result = no * 2;
		int result1 = no * 3;
		str += no +""+ result+""+ result1;
		char ch ='1';
		boolean flag = false;
		for(int i=1;i<=9;i++) {
			flag = false;
			for(int j=0;j<str.length();j++) {
				if(ch == str.charAt(j)) {
					flag = true;
				}
			}
			if (flag == false) {
				break;
			}
			ch++;
		}
		if (flag) {
			System.out.println("Fascinating number");
		}
		else {
			System.out.println("Not fascinating number");			
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int num = sc.nextInt();
		checkFascinatingNo(num);
	}

}

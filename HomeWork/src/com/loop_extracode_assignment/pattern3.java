package com.loop_extracode_assignment;

public class pattern3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			
			//spaces
			for (int j =3; j >=i; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}

			for (int l = i; l >= 1; l--) {//1,2,3
				System.out.print(l);//2,1==3,2,1
			}
			System.out.println();
		}
	}
}

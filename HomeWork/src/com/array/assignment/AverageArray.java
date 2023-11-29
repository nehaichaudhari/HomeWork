package com.array.assignment;

public class AverageArray {
	static void findAvg(int ar[]) {
		int min, max, avg = 0;
		min = max = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (min > ar[i]) {
				min = ar[i];
			}
			if (max < ar[i]) {
				max = ar[i];
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != min && ar[i] != max) {
				avg += ar[i];
			}
		}
		
		avg =avg / (ar.length-2);
		System.out.println("avg is: "+avg);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		findAvg(arr);
	}

}

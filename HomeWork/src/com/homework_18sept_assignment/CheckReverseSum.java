package com.homework_18sept_assignment;

public class CheckReverseSum {
	static boolean checkReverseSum() {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Input Value : ");
		int num = sc.nextInt();// 678597
		sc.close();*/
		int num = 678597;

		int no1 = num;//678597
		int no2 = reverse(num);//795876
		int i = 0, j = 0;

		int sum1 = 0, sum2 = 0;
		int rem1 = 0, rem2 = 0;
		while (i < 3) {
			rem1 = no1 % 10;//7===9====5
			sum1 = sum1 + rem1;//7+9+5
			no1 = no1 / 10;//678597===67859===6785
			i++;
		}

		while (j < 3) {
			rem2 = no2 % 10;
			sum2 = sum2 + rem2;
			no2 = no2 / 10;
			j++;
		}

		if (sum1 == sum2) {
			return true;
		} else {
			return false;
		}
	}
	static int reverse(int num) {
		int rev = 0, rem = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println(checkReverseSum());
	}

}

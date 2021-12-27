package Java2021;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {

		int num;
		int i;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("These are the divisors of the Number " + num + " are as below");
		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println("" + i);
			}
		}
		sc.close();
	}

}

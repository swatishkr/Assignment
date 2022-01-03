package Java2021;

import java.text.NumberFormat;
import java.util.Scanner;

public class CheckArmstrong {

	public static void main(String args[]) {

		int number;
		//int pow;
		int sum = 0;
		int i;
		System.out.println("Enter the number to be checked");
		try (Scanner sc = new Scanner(System.in)) {
			number = sc.nextInt();
int pow = String.valueOf(number).length();
			while (number > 0) {
				int val = number % 10;
				System.out.println(val);
				sum += Math.pow(val,pow );
				number = number / 10;
			}

			System.out.println(sum);
			/*
			 * 
			 * char[] input = number.toCharArray(); pow = input.length;
			 * 
			 * for (i = 0; i < pow; i++) { System.out.println((int)input[i]); int val =
			 * Character.getNumericValue(input[i]); // System.out.println(sum); sum +=
			 * Math.pow(val, pow); // System.out.println(sum); // System.out.println(pow); }
			 */
		}
	}

}

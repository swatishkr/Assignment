package Java2021;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		if (palindromeCheck(null)) {
			System.out.println("The String is Palindrome");
		} else {
			System.out.println("The String is not Palindrome");
		}
	}

	public static boolean palindromeCheck(String input) {
		// String input;
		System.out.println("Please enter the string");
		try (Scanner sc = new Scanner(System.in)) {
			input = sc.nextLine();
			int left = 0;
			char[] temparray = input.toCharArray();
			int right = temparray.length - 1;

			while (left < right) {
				if (temparray[left] != temparray[right]) {

					return false;
				} else {
					right--;
					left++;
				}

			}
			return true;

		}

	}
}

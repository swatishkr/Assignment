package Java2021;

import java.util.Scanner;

public class StringReverse {
	
	

	public static void main(String[] args) {

		String input;
		System.out.println("Please enter the string to be reversed");
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		int left = 0;
		char[] temparray = input.toCharArray();
		int right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;

		}
		for (char c : temparray) {
			System.out.print(c);

		}

	}

	public static String getInput() {

		String input;
		System.out.println("Please enter the String");
		try(Scanner sc = new Scanner(System.in)){
		input = sc.nextLine();
		}
		return input;

	}

}

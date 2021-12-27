package Java2021;

import java.util.Scanner;

public class SmallerThanFive {

	public static void main(String[] args) {

		String input;
		int limit = 5;
		int count = 0;
		System.out.println("Enter the list of numbers to be checked");
		try (Scanner sc = new Scanner(System.in)) {
			input = sc.nextLine();
			String[] in = input.split(",");
			for (String s : in) {
				if (Integer.parseInt(s) < limit) {
					count++;
				}
			}
			System.out.println("The number of inputs in list that are less than 5 are " + count);

		}
		
		
		
	
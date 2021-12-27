package Java2021;

import java.util.Scanner;

public class TurningHundred {

	public static void main(String args[])

	{

		try (Scanner sc = new Scanner(System.in)) {
			Person p = new Person();
			System.out.println("Enter your name");
			p.name = sc.nextLine();
			System.out.println("Enter your age");
			p.setAge(sc.nextInt());
			p.getYearsLeft();
			//System.out.println(p.getAge());
		}

	}

	public static class Person {
		private int age;
		private String name;
		private int yearsLeft;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if ((age < 0) && (age > 100)) {

				System.out.println("The entered age is out of bound");
			} else {
				this.age = age;
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setYearsLeft(int yearsLeft) {
			this.yearsLeft = yearsLeft;
		}

		public void getYearsLeft() {
			yearsLeft = 100 - age;
			System.out.println("Hi " + name + ", Nice to meet you!!");
			System.out.println("You are " + age + " years old.");
			yearsLeft = 100 - age;
			System.out.println("You have " + yearsLeft + " years more to hit the century!!");
			System.out.println("Hope to see you again!");
			// return yearsLeft;
		}
	}
}
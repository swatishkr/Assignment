package Java2021;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int number;
		//int check;
		int othernum;
		boolean yn;
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Welcome to EvenOdd, Please enter an input");
		
		number=sc.nextInt();
		
	if(number%2==0)
	{
		System.out.println("The Input Number entered is Even");
	
		
	if(number%4==0)
		{
			System.out.println("This input entered is multiple of 4");
		}
	
	}else {
	System.out.println("The number is odd");
	}
	System.out.println("Do you wish to contunue? ");
	Scanner ch=new Scanner(System.in);
	yn=ch.nextBoolean();
	if (yn==true)
	{ System.out.println("Lets check if the number divides other in two halfs ");
	System.out.println("Input the other Number to check ");
	Scanner on=new Scanner(System.in);
	othernum=on.nextInt();
	if(number/othernum==number/2)
	{
		System.out.println("This divides them in equal parts ");
	}

	else
	{
	System.out.println("This does not divides them in equal parts ");
	}
	}
	sc.close();
}
	}

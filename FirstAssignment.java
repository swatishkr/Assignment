package Java2021;

import java.util.Scanner;

public class FirstAssignment {

	public static void main(String[] args) {
		// 
		
		int side1=10;
		int side2=10;
		int side3=0;
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter first side of the triangle");
			side1=sc.nextInt();
			System.out.println("Enter second side of the triangle");
			side2=sc.nextInt();
			System.out.println("Enter third side of the triangle");
			side3=sc.nextInt();
		}
		
		/* Check for the triangle formation rule
		
		(side2 + side3) > side1
		(side1 + side3) > side2
		(side2 + side1) > side3 
		     
		 */
		if(side1==0 || side2==0 || side3==0) {
			
			System.out.println("Triange cannot be formed");}
		
			else
		if((side2 + side3) > side1 ) {
		
			System.out.println("The triangle1 is formed with sides "+side1+ " " +side2+ " " +side3);
		}else
		{ if((side1 + side3) > side2 ) {
			
			System.out.println("The triangle is formed with sides "+side1+" "+side2+" "+side3);
		}
		else {
			if((side2 + side1) > side3 ) {
				
				System.out.println("The triangle is formed with sides "+side1+ " " +side2+ " " +side3);
		
			
			}
			
			}
				
			}
		}
		}
	



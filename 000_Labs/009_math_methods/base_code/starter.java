/*
 *	Author: Nicky C. 
 *  Date: 9/11-9/13
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st number: ");
		double x=sc.nextDouble();
		System.out.println("Enter your 2nd number: ");
		double y=sc.nextDouble();
		
		System.out.println("Here is the max of both Doubles:");
		System.out.println(Math.max(x,y));
		
		System.out.println("Here is the square root of both Doubles:");
		System.out.println(Math.sqrt(y));
		
		System.out.println("Here is the power of x^y:");
		System.out.println(Math.pow(x,y));
		
		
		
		
		
	
		


		
	}
}

/*
 *	Author: Nicholas C.
 *  Date:9/16
 *	Collaborator(s): Nathanial
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
	
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Please enter an integer:");
		int min=sc.nextInt();
		System.out.println("Please enter a new integer bigger than the first");
		int b=sc.nextInt();
		int range = b - min;
		
		
		System.out.println("Your range is "+min+" to "+b);
		System.out.println("Here are 5 numbers generated in that range");
		System.out.print((int)(Math.random()*range+min)+" ");
		System.out.print((int)(Math.random()*range+min)+" ");
		System.out.print((int)(Math.random()*range+min)+" ");
		System.out.print((int)(Math.random()*range+min)+" ");
		System.out.print((int)(Math.random()*range+min)+" ");
	
		
	}
}

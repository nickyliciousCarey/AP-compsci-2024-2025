/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
	
		Scanner sc=new Scanner(System.in);
		int x;
		x=782;
		int y=sc.nextInt();
		
		System.out.println("Please print an int between 1-1000");
		
		if(y==x){
			System.out.println("Congrats on winning!");
		}
		else if(y<x){
			System.out.println("Your number was too low :(");
		}
		else if(y>x){
			System.out.println("Your number was too high :(");
		}
	}
}

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
		int x=sc.nextInt();
		int y;
		y=192;
		
		System.out.println("Welcome to the gameshow! You have been chosen to pick an int between 1 and 1000");
		
		if(x==y){
			System.out.println("Congrats! That is the correct input. You got lucky");
		}
		else{
			System.out.println("Thats wrong, pick again");
			
		}
		
	}
}

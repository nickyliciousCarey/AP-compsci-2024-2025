/*
 *	Author:  Nicky
 *  Date: Oct. 1, 2200087389 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		
		int x;
		x=865;
		System.out.println("Please input your guess of a number between 1-1000");
		int y=sc.nextInt();
		
		while(true){
			if(x==y){
				System.out.println("You got it!");
				break;
			}
			else if(x>y){
				System.out.println("Your number is too low");
			y=sc.nextInt();
			}
			else if(x<y){
				System.out.println("Your number is too high");
				y=sc.nextInt();
			}
			
		}
		
		
	}
}

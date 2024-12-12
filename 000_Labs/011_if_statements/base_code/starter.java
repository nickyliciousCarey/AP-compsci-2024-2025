/*
 *	Author:  Nicholas Carey
 *  Date: 9/17
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Lets go out with some friends!");
		System.out.println("Here are some of the options:");
		System.out.println("1:	Lets go to froyo");
		System.out.println("2:	Lets go to the Americana!");
		
		int place1=sc.nextInt();//1 or 2
		int place1option1=sc.nextInt();//1, 2, or 3
		int place1option2=sc.nextInt();//1, 2, or 3
		
		if(place1==1){
			System.out.println("Alrighty, lets go to froyo!");
			System.out.println("What are you going to get from froyo?");
		}
		
		else if(place1==2){
			System.out.println("Alrighty, lets go to the Americana!");
			System.out.println("What is your favorite store in the Americana?");
		}
		
		if(place1option1==1){
			System.out.println(" ");
		}
		
	}
}

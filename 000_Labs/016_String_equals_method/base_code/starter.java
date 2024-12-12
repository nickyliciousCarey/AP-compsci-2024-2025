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
		
		String Wizard=new String("You chose wizard! You do wizard things");
		String Warrior=new String("You chose Warrior! You do warrior things");
		String Rogue=new String("You chose Rogue! You do rogue things");
		
		System.out.println("Please put in which of the following roles you would like to choose");
		System.out.println("1: Wizard");
		System.out.println("2: Warrior");
		System.out.println("3: Rogue");
		
		int x=sc.nextInt();
		
		if(x==1){
			System.out.println(Wizard);
		}
		else if(x==2){
			System.out.println(Warrior);
		}
		else if(x==3){
			System.out.println(Rogue);
		}
		else{
			System.out.println("You didn't input the right number!");
		}
		
	}
}

/*
 *	Author:  Nicholas Carey
 *  Date: 9/17-->9/19
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		
		Scanner sc=new Scanner(System.in);
		
		int somethingx=sc.nextInt();
		int somethingy=sc.nextInt();
		
		
		if(somethingx==somethingy){
			System.out.println("Congrats! these numbers are the same :D");
			
		}
		else{
		 System.out.println("These numbers are different:D");
		}
	}
}

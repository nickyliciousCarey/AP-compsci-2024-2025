/*
 *	Author:  Nicholas Carey
 *  Date: 9/23
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("I love to learn coding remotely."); 
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please input 3 integers.");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		String bigger=new String(" is the bigger number.");
		
		if(x>y & x>z){
			System.out.println(x+bigger);
			
		}
		if(y>x & y>z){
			System.out.println(y+bigger);
		}
		if(z>x & z>y){
			System.out.println(z+bigger);
		}
		
		String smaller=new String(" is the smaller number.");
		
		if(x<y & x<z){
			System.out.println(x+smaller);
		}
		if(y<x & y<z){
			System.out.println(y+smaller);
		}
		if(z<x & z<y){
			System.out.println(z+smaller);
		}
		
	}
}

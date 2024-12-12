/*
 *	Author:  Nicholas C
 *  Date: 9/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc=new Scanner(System.in);
		int x;
		x=0;
		
		System.out.println("Please output your name");
		String name=sc.nextLine();
		System.out.println("Please input the amount of times you want this name to repeat");
		int y=sc.nextInt();
		
		while(x<y){
			System.out.println(name);
			x=x+1;
		}
		
	}
}

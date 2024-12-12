/*
 *	Author:  Nicky C
 *  Date: 11/21
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word!");
		String a = sc.nextLine();

		for(int i = a.length(); i > 0; i = i-1) {
			System.out.println(a.substring(i-1, i));
		}
		System.out.println(a.substring(0));


		
	}
}

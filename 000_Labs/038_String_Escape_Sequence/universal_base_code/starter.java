/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter something sassy");
		String input = sc.nextLine();
		
		System.out.println("\nOh, really? You said: \n\t\"" + input + "\"\n");
        System.out.println("Well, here's my *response*...\n");
        System.out.println("\t\"How original...\"\n");
        System.out.println("\t\"Did you really just say that?\"\n");
        System.out.println("Let me break it down for you:");
        System.out.println("\t* That's so cliché.\n\t* Totally agree.\n");
        System.out.println("\tBut hey, if it makes you feel better...\n");
        System.out.println("\t\tI’ll just say: \"Fine!\"");
        System.out.println("\nEnd of conversation. \n\nGoodbye!");	


		
	}
}

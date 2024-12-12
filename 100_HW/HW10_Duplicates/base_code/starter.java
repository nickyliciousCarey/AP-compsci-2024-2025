/*
 *	Author: Nicholas C
 *  Date: 11/10
 * 	Collaborator(s): 
*/

/* Create a program to do the following:
1. Create an array of 20 elements.
     a. The elements should have random values between 1 and 10.
2. Find all duplicates of a random number. 
     a. Generate a random number between 1 and 10. This will be your target number
     b. Find all duplicate numbers of your target number. 
     c. Print out the index of where ALL duplicates are and print out the total number of duplicates.
3. Find if there are two consecutive numbers in a row
     a. Using the same array as above. 
     b. Find if two consecutive numbers in a row are the same. 
     c. Print their indexes and what number it was!
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		int [] array = new int [20];
		int x = 0;
		int z = 0;
		int y = (int)((Math.random()*10)+1);
		for(int i =0; i < array.length; i++) {
			array[i] = (int)((Math.random()*10)+1);
			System.out.println("Here is #" + i + ": " + array[i]);
			if (array[i] == y) {
				x++;
			}
			if (i < array.length - 1 && array[i] == array[i + 1]) {
				System.out.println(array[i] + " is a consecutive duplicate number!");
			}
			else {
				System.out.println(array[i] + " is not a consecutive duplicate number");
			}
		}
		System.out.println("There are " + x + " duplicates of " + y + "!");
		
		
	}
	
}

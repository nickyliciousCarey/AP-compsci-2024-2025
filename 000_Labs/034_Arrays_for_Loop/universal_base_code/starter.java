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
		int [] arr = new int [1000];
		
		
		//Assigns array
		for(int i = 0; i<1000; i++) {
			int random = (int)(Math.random()*10);
			arr[i] = random;
		}
		
		for(int x = 0; x < 1000; x++) {
			System.out.println(arr[x]);
		}
		
	}
}

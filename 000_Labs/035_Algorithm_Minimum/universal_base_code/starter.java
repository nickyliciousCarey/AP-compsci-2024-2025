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
		int arrayCount = ((int)(Math.random() * 150) + 51);
		int [] arr = new int [arrayCount];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = (int)((Math.random()*99)+1);
			
			if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
            sum = sum + arr[i];
		}
		
		System.out.println("The minimum is: " + min);
		System.out.println("The maximum is: " + max);
		
		double average = ((double)(sum)) / arrayCount;
		System.out.println("The average is: " + average);
	}
}

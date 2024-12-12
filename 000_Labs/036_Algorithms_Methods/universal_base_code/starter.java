/*
 *	Author: Nicky 
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {

/*1. Make a toStringArray method for your arrays
	a. Print out ALL elements of your array
	b. Input is an integer array
	c. Returns nothing*/
public static void toStringArray(int [] x) {
	for(int i = 0; i < x.length; i++) {
		System.out.println(i + ", " + x[i]);
	}
	return;
}

/*2. Make a getArrayAverage method
	a. Gets the average of all integer elements in an array
	b. Input is an integer array
	c. Returns an integer that’s the average */
public static int getArrayAverage(int [] x) {
	int average;
	int totIndex = 0;
	for(int i = 0; i < x.length; i++) {
		totIndex = totIndex + x[i];
	}
	return average = totIndex/x.length;
}

/*1. Make a getArrayMax method
	a. Gets the maximum of all integer elements in an array
	b. Input is an integer array
	c. Returns an integer that’s the maximum */
public static int getArrayMax(int [] x) {
	int max = Integer.MIN_VALUE;
	for(int i = 0; i < x.length; i++) {
		if (x[i] > Integer.MIN_VALUE) {
			max = x[i];
		}
	}
	return max;
}

/*2. Make a getArrayMin method
	a. Gets the minimum of all integer elements in an array
	b. Input is an integer array
	c. Returns an integer that’s the minimum */
public static int getArrayMin(int [] x) {
	int min = Integer.MAX_VALUE;
	for(int i = 0; i < x.length; i++) {
		if (x[i] < Integer.MAX_VALUE) {
			min = x[i];
		}
	}
	return min;
}

	public static void main(String args[]) {
		/*1. In your main
	a. Create an array of 100 random integers in an array
		i. Values between 1 and 100
	b. Call toStringArray on the array
	c. Call getArrayAverage on the array
	d. Call getArrayMax on the array
	e. Call getArrayMin on the array */
		int [] x = new int [100];
		for (int i = 0; i < x.length; i++) {
			x[i] = (int)((Math.random()*100)+1);
		}
		toStringArray(x);
		int Average = getArrayAverage(x);
		System.out.println("The average is: " + Average);
		int Max = getArrayMax(x);
		System.out.println("The maximum is: " + Max);
		int Min = getArrayMin(x);
		System.out.println("The minimum is: " + Min);
	}
}

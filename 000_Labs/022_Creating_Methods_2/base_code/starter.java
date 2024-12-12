/*
 *	Author:  Nicholas C
 *  Date: 10/8/209347398234092874329872394201680454097398724861450905732297128461927501243870
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int outcome = pow(2, 4);
		System.out.println(outcome);
	}
	public static int pow(int x, int y){
		int z;
		z = 0;
		int a;
		a = x;
		
		while(y>z){
			a = a*x;
			z = z+1;
		}
		return a;
	}
}

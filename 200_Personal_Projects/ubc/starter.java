/*
 *	Author:  
 *  Date: 
*/

/*import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		


		
	}
}*/


/*
 *	Author:Nicholas Carey
 *  Date: 10/10/24023984237703492u1907159346108
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please print a number:");
		int x = sc.nextInt();
		boolean prime = checkPrime(x);
		System.out.println(prime);
		
		
	}
	public static boolean checkPrime(int x){
		int check = x+2;
		while(check != x){
			if(x%check != 0 && check > x){
				check = check+1;
			}
			else if(x%check == 0){
				return false;
			}
		}
		return true;
	}
	public static void printPrimes(int newNumber){
		int x = 0;
		while(newNumber>=1){
			if(true){
				checkPrime(x);
				return;
			}
			else{
				return;
			}
		}
	}
}



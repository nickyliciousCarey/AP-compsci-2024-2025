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
		int newNumber = sc.nextInt();
		printPrimes(newNumber);
		
	}
	
	 public static boolean checkPrime(int x) {
        if (x < 2) {
            return false;
        }
        int check = 2; 
        while (check * check <= x) { 
            if (x % check == 0) {
                return false; 
            }
            check++; 
        }
        return true; 
    }
	
	 public static void printPrimes(int newNumber) {
        int primes = 2;
        while (primes < newNumber) { 
            if (checkPrime(primes)) {
                System.out.println(primes); 
            }
            primes++; 
        }
    }
}

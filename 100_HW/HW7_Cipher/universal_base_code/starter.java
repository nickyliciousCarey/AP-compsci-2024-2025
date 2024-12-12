/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a code to decode");
	String code = sc.nextLine();
	
	System.out.println("Encode/Decode (1)");
	
	System.out.println(Cipher.encode(message));
	
	System.out.println("Encode/decode (2)");
	
	System.out.println(Cipher.keyedEncode(message, key));
	
	System.out.println("decipher (last 2)");
	key = 0;
	while (key<37){
		key++;
		System.out.println("Key " + key + " = ");
		System.out.println(Cipher.keyedEncode(message, key));
	}
	}
}

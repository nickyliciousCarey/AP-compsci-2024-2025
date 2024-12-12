/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
	String role;
	int strength;
	int dexterity;
	int rizz;
	int intelligence;
	
	public myCharacter(){
	role = "rogue";
	strength = 0;
	dexterity = 0;
	rizz = 0;
	intelligence = 0;
	}

	public void myToString() {
		System.out.println("Your role is rogue");
		System.out.println("Your strength trait is 0");
		System.out.println("Your dexterity trait is 0");
		System.out.println("Your rizz trait is 0");
		System.out.println("Your intelligence trait is 0");
	return;
	}

}


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
		myCharacter Nicky = new myCharacter();
		Nicky.setRole("Warrior");
		Nicky.setStrength(-1);
		Nicky.setDexterity(5);
		Nicky.setRizz(5);
		Nicky.setIntelligence(10);
		Nicky.setAll("Warrior", 0, 5, 5, 10);
		Nicky.myToString();
		
	}
}

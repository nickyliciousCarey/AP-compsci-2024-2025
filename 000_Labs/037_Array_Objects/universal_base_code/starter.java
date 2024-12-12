/*
 *	Author:  Nicky C
 *  Date: 11/12
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
/*	1. Warriors and Wizard will be pitted against each other! */
/*	2. Create 100 Warriors and Wizards */
		Warrior[] warriors= new Warrior[100];
		for(int i = 0; i < warriors.length; i++) {
			warriors[i] = new Warrior();
		}
		Wizard[] wizards= new Wizard[100];
		for(int i = 0; i < wizards.length; i++) {
			wizards[i] = new Wizard();
		}
		
/*	3. Use the given methods to alternate attacking from Wizard to Warrior
		a. Start at the first Warrior and Wizard
		b. Wizards always attack first (they can cast from a far)
		c. Once a player is dead, move onto the next player. */
		int i = 0;	// Wizards
		int o = 0;	// Warriors
		while(i < wizards.length && i != wizards.length && o < warriors.length && o != warriors.length) {
 				wizards[i].attack(warriors[o]);
			
				if (warriors[o].isDead() == true && o < warriors.length) {
					o++;
				}
				
				if(warriors[99].isDead() == false) {
					warriors[o].attack(wizards[i]);
				
					if (wizards[i].isDead() == true && i < wizards.length) {
						i++;
					}
				}
			}
		} 
		
/*	4. Once either the last Warrior or Wizard are dead, then you stop the war
		a. Mention who won and how many fighters are left */
		if (i < 99) {
			System.out.println("The Wizards have won, they have " + (99 - i) + " troops left!");
		}
		else {
			System.out.println("The Warriors have won, they have " + (99 - o) + " troops left!");
		}
	}
}

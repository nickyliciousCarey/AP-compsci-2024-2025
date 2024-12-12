/*
 *	Author:  Nicholas C
 *  Date: 10/16
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

//Global variables
public class myCharacter{
	String role;

	public myCharacter() {
		role = "no role";
	}
	public myCharacter(String r) {
		r = role;
	}
	public void chosenRole(String r){
		if (r.equals("Wizard") || r.equals("Rogue") || r.equals("Warrior")){
			System.out.println("You chose " + r + "! How cunning!");
		}
		else{
			System.out.println("Please choose go back to no role again :(");
		}
	}
}


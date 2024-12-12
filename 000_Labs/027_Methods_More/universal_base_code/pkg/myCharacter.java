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
	
	public String setRole(String R){
		R = role;
		if (R.equals("Warrior") || (R.equals("Rogue") || R.equals("Wizard"))){
			return R;
		}
		else {
			String backToHome = "Go back and input Warrior, Rogue, or Wizard";
			return backToHome;
		}
	}
	
	public int setStrength(int s){
		s = strength;
		int x = strength;
		if (s < 0){
			x = 0;
			return x;
		}
		else{
			return s;
		}
	}
	
	public int setDexterity(int d){
		d = dexterity;
		return d;
	}
	public int setRizz(int r){
		r = rizz;
		return r;
	}
	public int setIntelligence(int i){
		i = intelligence; 
		return i;
	}
	public boolean setAll(String R, int s, int d, int r, int i){
		return true;
	}
	

	public void myToString() {
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your rizz trait is " + rizz);
		System.out.println("Your intelligence trait is " + intelligence);
	return;
	}

}
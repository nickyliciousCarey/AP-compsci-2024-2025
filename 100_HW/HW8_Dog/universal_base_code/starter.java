/*
 *	Author: Nicky C
 *  Date: 10/27
 *	Collaborator(s): N/A
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog cat = new Dog();
		cat.setAge(10);
		if (cat.isSleeping() == true) {
			System.out.println("cat is asleep");
		}
		else {
			cat.bark();
		}
		
		Dog dog = new Dog();
		dog.NameBreed("Doggy", "dodge");
		if (dog.isSleeping() == true && cat.isSleeping() == true) {
			dog.bark();
		}
		else if(dog.isSleeping() == false && cat.isSleeping() == true) {
			dog.bark();
		}
		else {
			
		}
		
		
	}
}

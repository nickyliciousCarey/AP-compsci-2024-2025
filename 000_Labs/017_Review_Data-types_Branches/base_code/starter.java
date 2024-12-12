/*
 *	Author:  Nicholas Carey
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Hello! What is your name traveler?");
		String name=sc.nextLine();
		
		System.out.println("Well "+name+", what would your title happen to be?");
		String title=sc.nextLine();
		
		String Wizard=new String("You chose Wizard! You do Wizard things");
		String Warrior=new String("You chose Warrior! You do Warrior things");
		String Rogue=new String("You chose Rogue! You do Rogue things");
		
		System.out.println("Please put in which of the following roles you would like to choose");
		System.out.println("Wizard");
		System.out.println("Warrior");
		System.out.println("Rogue");
		
		String role=sc.nextLine();
		
		if(role.equals("Wizard")){
			System.out.println(Wizard);
		}
		else if(role.equals("Warrior")){
			System.out.println(Warrior);
		}
		else if(role.equals("Rogue")){
			System.out.println(Rogue);
		}
		else{
			System.out.println("You didn't input the right name!");
		}
		
		
		
		System.out.println("You have 20 points to spend on the following options:");
		System.out.println("Strength(1-10)");
		System.out.println("Dexterity(1-10)");
		System.out.println("Intelligence(1-10)");
		System.out.println("Rizz(1-10)");
		
		
		int Strength=sc.nextInt();
		if(20-Strength>=0 && Strength<=10 && Strength>=0){
			System.out.println("You have "+Strength+" Strength points");
			System.out.println("You have "+ (20-Strength) + " points left");
		}
		else{
			System.out.println("Please enter a valid input!");
		}
		
		int Dexterity=sc.nextInt();
		if(20-Strength-Dexterity>=0 && Dexterity<=10 && Dexterity>=0){
			System.out.println("You have "+Dexterity+" Dexterity points");
			System.out.println("You have "+ (20-Strength-Dexterity) +" points left");
		}
		else{
			System.out.println("Please enter a valid input!");
		}
		
		int Intelligence=sc.nextInt();
		if(20-Strength-Dexterity-Intelligence>=0 && Intelligence<=10 && Intelligence>=0){
			System.out.println("You have "+Intelligence+" Intelligence points");
			System.out.println("You have "+ (20-Strength-Dexterity-Intelligence) +" points left");
		}
		else{
			System.out.println("Please enter a valid input!");
		}
		
		int Rizz=sc.nextInt();
		if(20-Strength-Dexterity-Intelligence-Rizz>=0 && Rizz<=10 && Rizz>=0){
			System.out.println("You have "+Rizz+" Rizz points");
			System.out.println("You have"+ (20-Strength-Dexterity-Intelligence-Rizz) +(" points left"));
		}
		else{
			System.out.println("Please enter a valid input!");
		}
		if(20-Strength-Dexterity-Intelligence-Rizz>0){
			System.out.println("You still have "+(20-Strength-Dexterity-Intelligence-Rizz)+" points left!");
		}
		
		
		System.out.println("______________________________");
		System.out.println(" ");
		
		
		System.out.println("You are "+name+", the "+title+" of CVHS");
		System.out.println(role+" You have the following stats:");
		System.out.println("Strength - "+Strength);
		System.out.println("Dexterity - "+Dexterity);
		System.out.println("Intelligence - "+Intelligence);
		System.out.println("Rizz - "+Rizz);
		System.out.println(" ");
		System.out.println("Good luck with your quest "+name+"!");
		
		
		
		
		
		
	}
}

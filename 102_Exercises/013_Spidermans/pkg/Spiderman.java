package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	public Spiderman() {
		// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	public Spiderman(String actor) {
		// String Actor constructor! 			Age - 0, Villain Unknown 
		actor = actor;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int age){
		// int Age constructor! 				Actor - Unknown, Villain Unknown
		actor = "unknown";
		age = age;
		villain = "unknown";
	}
	public Spiderman(String actor, int age) {
		// String Actor, int Age constructor! 	Villain Unknown
		actor = actor;
		age = age;
		villain = "unknown";
	}
	public Spiderman(String actor, int age, String villain) {
		// String Actor, int Age, String Villain constructor!
		actor = actor;
		age = age;
		villain = villain;
	}		
	
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	

	public void setActor(String actor){
		this.actor = actor;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setVillain(String villain) {
		this.villain = villain;
	}

	public String getActor() {
		return actor;
	}
	public int getAge(){
		return age;
	}
	public String getVillain() {
		return villain;
	}
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}

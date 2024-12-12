package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name; 
	int age; 
	String breed;
	
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "Big red dog";
	}
	
	public void Name(String name) {
		name = name;
		int age = 1;
		String breed = "dog dog";
	}
	
	public void NameBreed(String name, String breed) {
		name = name;
		breed = breed;
		int age = 1;
	}
	
	public void NameAge(String name, int age) {
		name = name;
		age = age;
		String breed = "dog dog";
	}
	
	
	public void setName(String name) {
		name = name;
		return;
	}
	public void setAge(int age) {
		age = age;
		return;
	}
	public void setBreed(String breed) {
		breed = breed;
		return;
	}
	
	public String getName(){
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		int fiftyfifty = (int)(Math.random() * 2) + 1;
		if (fiftyfifty > 1) {
			return true;
		}
		else {
			return false;
		}
	}
	public void bark() {
		System.out.println(getName()+" says bark!");
		return;
	}

}

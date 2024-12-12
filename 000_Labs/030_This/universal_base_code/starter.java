/*
 *	Author:  Nicholas C
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	

	public static void main(String args[]) {
		String name;
		int age;
		
		PooleDwarf one = new PooleDwarf();
		name = randName();
		one.setName(name);
		age = (int)(Math.random()*100);
		one.setAge(age);
		
		
		PooleDwarf two = new PooleDwarf();
		name = randName();
		two.setName(name);
		age = (int)(Math.random()*100);
		two.setAge(age);
		
		PooleDwarf three = new PooleDwarf();
		name = randName();
		three.setName(name);
		age = (int)(Math.random()*100);
		three.setAge(age);
		
		PooleDwarf four = new PooleDwarf();
		name = randName();
		four.setName(name);
		age = (int)(Math.random()*100);
		four.setAge(age);
		
		PooleDwarf five = new PooleDwarf();
		name = randName();
		five.setName(name);
		age = (int)(Math.random()*100);
		five.setAge(age);
		
		PooleDwarf six = new PooleDwarf();
		name = randName();
		six.setName(name);
		age = (int)(Math.random()*100);
		six.setAge(age);
		
		PooleDwarf seven = new PooleDwarf();
		name = randName();
		seven.setName(name);
		age = (int)(Math.random()*100);
		seven.setAge(age);
		
		PooleDwarf firstDwarf = one; 
		int duplicates = 0;

		if (two.isSameName(firstDwarf.getName())) {
    	duplicates++;
		}
		if (three.isSameName(firstDwarf.getName())) {
    	duplicates++;
		}
		if (four.isSameName(firstDwarf.getName())) {
    	duplicates++;
		}
		if (five.isSameName(firstDwarf.getName())) {
    	duplicates++;
		}
		if (six.isSameName(firstDwarf.getName())) {
    	duplicates++;
		}
		if (seven.isSameName(firstDwarf.getName())) {
    	duplicates++;
		}
		
		System.out.println("There were " + duplicates + " duplicates of the name " + firstDwarf.getName());
	}
}

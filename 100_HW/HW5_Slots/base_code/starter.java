/*
 *	Author: Nicky C
 *  Date: 10/3
 * 	Collaborator: N/A
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc=new Scanner(System.in);
		int count;
		count=100;
		
		System.out.println("The rules of this slot machine: You will start with 100$ in cash! You have to input a wager in order to win(or lose money. The machine will run 3 random integers!");
		System.out.println("  - Two numbers are the same, it doubles your money wagered!");
		System.out.println("  - Three numbers are the same, it’s a jackpot! Triple the money wagered!");
		System.out.println("  - None are the same, you lose the money:(");
		
		while(true){
		System.out.println("You have: "+count);
		System.out.println("If you would like to play, please type one of the following:Yes, yes, Y, y");
		System.out.println("If you don't want to play, please type one of the following:No, no, N, n");
		String yesno=sc.nextLine();
		
		    if(yesno.equals("yes")||yesno.equals("Yes")||yesno.equals("Y")||yesno.equals("y")){
		        System.out.println("Please print a wager between 1 & "+count);
		        int wager=sc.nextInt();
		        sc.nextLine();
		        
		        while(true){
		        if(wager<=count && wager<=100 && wager>=0){
		                	int x=(int)(Math.random()*10);
		                	int y=(int)(Math.random()*10);
		                	int z=(int)(Math.random()*10);
		                	System.out.println(x+" "+y+" "+z);
				
		                		if(x==y && x==z && y==z){
		                			System.out.println("Jackpot! Your money has been tripled!");
		                			System.out.println("You now have "+(count+(wager*3)));
		                			count = (count+(wager*3));
		                	
		                		}
		                		else if(x==y || x==z || y==z){
		                			System.out.println("2 Numbers were correct! Your money has been doubled!");
		                			System.out.println("You now have "+(count+(wager*2)));
		                			count = (count+(wager*2));
		                			
		                		}
		                		else if(count!=0 && x!=y && x!=z && y!=z){
		                			System.out.println("Sorry, your money has been lost :(");
		                			System.out.println("You now have "+(count-wager));
		                			count = (count-wager);
		                			
		                		}
		                		else if(count-wager==0){
		                			System.out.println("I'm sorry, but you lost it all :(");
		                			break;
		                		}
		                		break;
		        }
		    }
		    }	
		else if(yesno.equals("No")||yesno.equals("no")||yesno.equals("N")||yesno.equals("n")){
		    System.out.println("Alrighty lets not play");
		    System.out.println("You have $"+count+" left!");
		    break;
		}
		
		
		else{
		    System.out.println("Wrong output!");
		    break;
		}
	}
}
}

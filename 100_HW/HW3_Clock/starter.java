/*
 *	Author:Nicholas Carey
 *  Date:9/17->9/
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely.");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("For some reason you have to wake up on school days, but you are only allowed to sleep in 2 days in the week?");
		System.out.println("That isn't fair, but I'm not the one who makes the rules so here we are setting your alarms :(");
		System.out.println("Each of the following outputs are going to determine what day it is, starting with 0(Monday) and going through to every day of the week, so ending with 6(Sunday)");
		
		System.out.println("0:	Monday");
		System.out.println("1:	Tuesday");
		System.out.println("2:	Wednesday");
		System.out.println("3:	Thursday");
		System.out.println("4:	Friday");
		System.out.println("5:	Saturday");
		System.out.println("6:	Sunday");
		
		int answer1=sc.nextInt();//0, 1, 2, 3, 4, 5, or 6
		if (answer1==0){
			System.out.println("It's Monday:( Your alarm is at 7:00AM");
		}
		else if(answer1==1){
			System.out.println("It's Tuesday. Your alarm is at 7:00AM");
		}
		else if(answer1==2){
			System.out.println("It's Wednesday. Your alarm is at 7:00AM");
		}
		else if(answer1==3){
			System.out.println("It's Thursday, You are almost there! Your alarm is at 7:00AM");
		}
		else if(answer1==4){
			System.out.println("It's Friday! Your alarm is at 7:00AM");
		}
		else if(answer1==5){
			System.out.println("It's Saturday:D Your alarm is at 10:00AM");
		}
		else if(answer1==6){
			System.out.println("It's Sunday D: Your alarm is at 10:00AM");
		}
		else{
			System.out.println("You didn't type in the correct answer");
		}
		}
	}
}

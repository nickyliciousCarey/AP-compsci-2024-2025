/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
    Scanner sc = new Scanner(System.in);
    System.out.println("You are a new student at Crestwood academy. There are some important stepts to keep going");
    System.out.println("1:  Get your breakfeast");
    System.out.println("2:  Double check your school supplies");
    System.out.println("3:  Get to school and start your day");
   
    int answer1=sc.nextInt();//1, 2, or 3
    
    if (answer1==1){
        System.out.println("You head to the kitchen to the amazing smell of bacon and eggs. As you go to the table, the family is surounding you ready to send you off to school.");
	}
	else if(answer1==2){
	    System.out.println("You double check your school supplies to make sure you have all the essentials, a notebook, binders, pencils and pens, and everthying else you could possible imagine.");
	}
	else if(answer1==3){
	    System.out.println("Who cares about getting ready for the day, lets head out to school and embarrass ourselves!");
	}
	
	System.out.println("After you feel ready for school, what should you grab next!");
	System.out.println("1:  Grab your wallet");
	System.out.println("2:  Grab your backpack");
	System.out.println("3:  Grab a snack to bring for the journey");
	
	
}
}
    
/*
 *	Author: Nicky
 *  Date: 9/11/24
 *	Collaborator(s): Nathaniel
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	int number;
	int a;
	a=1;
	int multa;
	multa=1;
	int multb;
	multb=2;
	int multc;
	multc=3;
	int multd;
	multd=4;
	int multe;
	multe=5;
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter a number");
	number=sc.nextInt();
	
	System.out.println("Here are the next 5 numbers! ");
	System.out.println((number)+", "+(number+a)+", "+(number+a+a)+", "+(number+a+a+a)+", and "+(number+a+a+a+a));
	
	System.out.println("Here are the next 5 multiples of "+ number);
	System.out.println((number*multa)+", "+(number*multb)+", "+(number*multc)+", "+(number*multd)+", and "+(number*multe));
	
	System.out.println("Here is "+ number+(" divided by 100"));
	System.out.println(number/100.0);
	
	System.out.println("Here is "+number+" divided by 10");
	System.out.println(number/10.0);
	


	}
}

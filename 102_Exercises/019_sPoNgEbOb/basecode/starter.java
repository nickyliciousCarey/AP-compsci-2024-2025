/*
	Author: Nicholas Carey
	Date: 12/5/24
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please input a sentance!");
	String sentance = sc.nextLine();
	
	while(true) {

		if(sentance.indexOf(" ") == -1) {
			break;
		}
		int space = sentance.indexOf(" ");
		String word = sentance.substing(0, space);
		System.out.println(spongeCase(sentance)+ " ");
		
		sentance = sentance.substing(space+1);
	}
	
	String spongeCaseSentance = spongeCase(sentance);
	System.out.println(spongeCaseSentance);
	
	}

	public static String spongeCase(String sentance) {
		String result = " ";
		for(int i = 0; i < sentance.length(); i++) {
			String letter = sentance.substring(i, i++);
			
			if(i%2 == 1) {
				letter = letter.toUpperCase();
			}
			else if (i%2 == 0) {
				letter = letter.toLowerCase();
			}
			 result= result + letter;
		}
		return result;
	}
}

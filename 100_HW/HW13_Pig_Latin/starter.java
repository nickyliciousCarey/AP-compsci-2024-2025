/*
   * Author: Nicky
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type a sentance to be converted to pig latin!");
		String sentance = sc.nextLine();
		
		String igpayAtinlay = pigLatin(sentance);
		System.out.println(igpayAtinlay);
		
	}
	
	public static String pigLatin(String sentance) {
		String WORD;
		String [] isWord = new String [sentance.length()];
		String consanant = " b c d f g h j k l m n p q r s t v w s t v "; 
		String vowel = " a e i o u ";
		
		for(int i = 0; i < sentance.length(); i++) {
			if (sentance.indexOf(" ") == -1) {
				if (sentance.substring(0).equals(sentance.indexOf(consanant)) && sentance.substring(1).equals(indexOf(vowel))) {
           			sentance = (sentance.substring(1, sentance.length()) + (sentance.substring(0)) + "ay ");
           		}
           		else if (sentance.substring(0).equals(sentance.indexOf(consanant)) && sentance.substring(1).equals(indexOf(consanant))) {
           			sentance = (sentance.substring(2, sentance.length()) + (sentance.substring(0, 1)) + "ay ");
           		}
           		else {
           			sentance = (sentance + "way ");
           		}
				isWord[i] = sentance;
			}
			else {
            	int spaces = sentance.indexOf(" ");
            	WORD = sentance.substring(0, spaces);
            	
           		if (WORD.substring(0).equals(WORD.indexOf(consanant)) && WORD.substring(1).equals(indexOf(vowel))) {
           			WORD = (WORD.substring(1, sentance.length()) + (WORD.substring(0)) + "ay ");
           		}
           		else if (WORD.substring(0).equals(WORD.indexOf(consanant)) && WORD.substring(1).equals(indexOf(consanant))) {
           			WORD = (WORD.substring(2, sentance.length()) + (WORD.substring(0, 1)) + "ay ");
           		}
           		else {
           			WORD = (WORD + "way ");
           		}
       			isWord[i] = WORD;

            	sentance = sentance.substring(spaces+1);
           	}
           	return isWord[i];
		} 
	}
	
	
}

/*
 *	Author:  Nicholas
 *  Date: 12/5
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a sentance :)");
		String sentance = sc.nextLine();
			
		String sentanceBackwards = backwards(sentance);
		System.out.println(sentanceBackwards);
	}
	
	public static String backwards(String sentance) {
		int startingNum = 0;
		String result = " ";
		String [] words = new String [sentance.length()];
			while(true) {
				if (startingNum < sentance.length()) {
					if ( sentance.indexOf(" ") == -1) {
                		words[startingNum] = sentance;
                		break;
            		}
            		else {
            			int spaces = sentance.indexOf(" ");
            			String WORD = sentance.substring(0, spaces);
            			words[startingNum] = WORD;
            			startingNum++;
            			sentance = sentance.substring(spaces+1);
            		}
				}
				String backSentance = "";
				for(int i = startingNum; i>= 0; i = i-1) {
					backSentance = (backSentance + " " + words[i]);
				}
				return backSentance;
			}
	}

}

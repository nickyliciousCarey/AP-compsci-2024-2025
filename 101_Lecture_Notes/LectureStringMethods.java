/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/

import java.util.*;

class LectureStringMethods{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a sentance!");
        String sentance = sc.nextLine();
        
        while(true) {
            if ( sentance.indexOf(" ") == -1) {
                System.out.println(sentance);
                break;
            }
            int spaces = sentance.indexOf(" ");
            String word1 = sentance.substring(0, spaces);
            System.out.println(word1);
            sentance = sentance.substring(spaces+1);
        }
        
        
	}
}
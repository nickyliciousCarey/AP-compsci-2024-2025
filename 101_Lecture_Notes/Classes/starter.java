/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        // Your Code Goes here!
       
        Car mobile = new Car();
        Car batmobile = new Car("Lambo", 525, "black");
        batmobile.paint("pink");
        mobile.vroom();
        batmobile.vroom();
	}
	
	
}
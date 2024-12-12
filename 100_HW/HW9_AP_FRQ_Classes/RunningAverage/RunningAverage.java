import java.util.*;

public class RunningAverage {
    /** The number of ratings included in the running average. */
    private int count;

    /** The average of the ratings that have been entered. */
    private double average;
    
    private double updateAverage;
    
    // There are no other instance variables.
    
    /** Creates a RunningAverage object.
    * Postcondition: count is initialized to 0 and average is
    * initialized to 0.0.
    */
    public RunningAverage(){
        /* implementation not shown */
        count = 0;
        average = 0.0 
        updateAverage;
    }

    /** Updates the running average to reflect the entry of a new
    * rating, as described in part (a).
    */
    public void updateAverage(double newVal){
        /* to be implemented in part (a) */
        newVal + average = updateAverage;
        count+1 = count;
    }


    /** Processes num new ratings by considering them for inclusion
    * in the running average and updating the running average as
    * necessary. Returns an integer that represents the number of
    * invalid ratings, as described in part (b).
    * Precondition: num > 0
    */
    public int processNewRatings(int num){
        /* to be implemented in part (b) */
        int numZeros = 0;
        if (x <= 0) {
            return numZeros++;
        }
        else {
            return numZeros;
        }
    }

    /** Returns a single numeric rating. */
    public double getNewRating(){
        /* implementation not shown */
        return (double)(updateAverage/(count-numZeros));
    }
}

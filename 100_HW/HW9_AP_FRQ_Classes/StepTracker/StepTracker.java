public class StepTracker { 
    private double steps;
    private int days;
    
    public StepTracker() {
        steps = 0.0;
        days = 0;
    }
    
    public void getDailySteps(double daySteps) {
        this.daySteps = daySteps;
        return;
    }
    public void getDays(int days) {
        this.days = days;
        return;
    }
    
    public boolean addDailySteps(double daySteps) {
        if (daySteps <= 10000) {
        return true;
    }
    else {
        return false;
    }
    
    
    public int activeDays() {
        if (daySteps() = true) {
            return days++;
        }
        else {
            return days;
        }
    }
    
    public double averageSteps() {
        (getDailySteps(daySteps) + steps) / (days) = double average;
        return average;
    }
    
}
package pkg;

public class Movie{
    String movieName;                   // movie name
    double movieRating;                 // movie rating 0.1 - 10
    int numRatings;                     // number of ratings
    int revenue;                        // how much money its made
    
    public Movie() {
        movieName = "Avengers";
        movieRating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String movieName, double movieRating, int numRatings, int revenue) {
        this.movieName = movieName;
        this.movieRating = movieRating;
        this.numRatings = numRatings;
        this.revenue = revenue;
    }
   
    //Part 2
    public void movieToString(){
        movieName = movieName;
        movieRating = movieRating;
        numRatings = numRatings;
        revenue = revenue;
        return;
    }
    
    //Part 3
    public String getMovieName() {
        return movieName;
    }
    public int getRevenue() {
        return revenue;
    }
    
    //Part 4
    public void addRating(double movieRating) {
        double x = movieRating *numRatings;
        movieRating = x+movieRating/(numRatings+1);
        return;
    }
    
    //Part 5
    public double getRating () {
        return movieRating;
    }
    public boolean compareRatings(Movie x){
        if (movieRating> getRating()) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class Player {

    //The default name should not be Peter, it should be null or ""
    private String name = null;
    private int numOfGuesses = 0;
    private int numOfHits = 0;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getNumOfHits() {
        return numOfHits;
    }
    public int getNumOfGuesses() {
        return numOfGuesses;
    }
    public void addHit(int h){
    }
    public void addGuess(int g){
    }
    public double getAccuracy(){
        //For now, we are going to return 0 because we haven't given you the formula you need to calculate the accuracy.
        //And there is no variable called Accuracy, so that was your compile error.
        //return Accuracy;
        return 0;
    }
}
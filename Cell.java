public class Cell {
    private boolean hasShip = false;  //boolean
    private char symbol;       //char
    private boolean wasHit = false;   //boolean
    private boolean wasGuessed = false; //boolean
    private Ship activeShip = null;  
    //private String Ship = activeShip; //Ship???
    
    public boolean getHasShip() {     //boolean
        return hasShip;
    }
    public void setHasShip(boolean hs) {        //void
        hasShip = hs;
    }    
    public char getSymbol() {  //char
        
        if (wasGuessed == true){
            if (wasHit == true){
                return BattleshipUtils.DISPLAY_HIT;
            }else{
                return BattleshipUtils.DISPLAY_MISS;
            }
        }else{
            return BattleshipUtils.DISPLAY_UNGUESSED;
        }
        
        //return symbol;
    }
    
    public void setSymbol(char s) {         //void
        symbol = s;
    }
    
    public boolean getWasHit() {      //boolean
        return wasHit;
    }
    
    public void setWasHit(boolean wh) {         //void
        wasHit = wh;
    }
    
    public void setWasGuessed(boolean wg){
        wasGuessed = wg;
    }
    
    public boolean getWasGuessed(){
        return wasGuessed;
    }
    
    public void setActiveShip(Ship ship) {
        this.activeShip = ship;
    }
    
    public Ship getActiveShip() {   //Ship???
        return activeShip;
    }
    
    public void guess(){
        this.wasGuessed = true;
        
        // was hit if there is a ship
        if (hasShip == true) {
            this.wasHit = true;
        }
    }
    
    public void checkStatus(){
        // check if active ship is sunk
        if (activeShip != null) {
            if (activeShip.isSunk() == true) {
                System.out.println("You sunk the ship!");
            }
        }
    }
}
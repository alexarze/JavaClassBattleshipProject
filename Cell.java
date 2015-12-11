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
    
    public Ship getActiveShip() {   //Ship???
        return activeShip;
    }
}
public class Cell {
    private boolean hasShip = false;  //boolean
    private char symbol;       //char
    private boolean wasHit = false;   //boolean
    private Ship activeShip = null;  
    //private String Ship = activeShip; //Ship???
    
    public boolean getHasShip() {     //boolean
        return hasShip;
    }
    public void setHasShip(boolean hs) {        //void
        hasShip = hs;
    }    
    public char getSymbol() {  //char
        return symbol;
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
    public Ship getActiveShip() {   //Ship???
        return activeShip;
    }
}
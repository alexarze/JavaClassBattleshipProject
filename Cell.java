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
    public void setsymbol(char s) {         //void
        symbol = s;
    }
    public boolean getwasHit() {      //boolean
        return wasHit;
    }
    public void setwasHit(boolean wh) {         //void
        wasHit = wh;
    }
    public Ship getactiveShip() {   //Ship???
        return activeShip;
    }
}
public class Ship {
    private int length = 1;
    private boolean[] wasHit;
    private boolean isVertical;  
    private Cell[]cellsOccupied;  
    
    public Ship(int length, int type, boolean isVertical) {  
         
    }  
      
     public int getLength() {  
         return length;   
    }  
        
    public boolean getWasHit() {  
          
        return false;  
    }  
    public void setWasHit(boolean[] wasHit) {  
        this.wasHit = wasHit;  
    }
    
    public Cell[] getCellsOccupied() {
        return cellsOccupied;
    }    
        
     public boolean getIsVertical() {  
          
        return isVertical;  
    }
      
    public void setIsVertical(boolean isVertical) {
        this.isVertical =isVertical;
    }  
        
    public boolean isSunk() {  
        boolean sunk = true;
        
        for (boolean hit : wasHit) {
            if (hit==false) {
                sunk = false;
                break;
            }
        }

        return sunk;  
      }  

}  

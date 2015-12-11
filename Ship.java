public class Ship {
    private BattleshipUtils.ShipSpecs specs = null;
    private boolean[] wasHit;
    private boolean isVertical;  
    private Cell[]cellsOccupied;  
    
    public Ship(BattleshipUtils.ShipSpecs specs, boolean isVertical) {  
         
    }  
      
     public int getLength() {  
         return specs.length;   
    }  
    
    public int type = null;
    public int getType() {
        return type;
    }
        
    public boolean[] getWasHit() {  
        return wasHit;  
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
        
        for (Cell cell : cellsOccupied) {
            if (cell.getWasHit()==false) {
                sunk = false;
                break;
            }
        }

        return sunk;  
      }  

}  

public class Ship {
    private BattleshipUtils.ShipSpecs specs = null;
    private boolean[] wasHit;
    private boolean isVertical;  
    private Cell[] cellsOccupied;  
    public int type = 0;
    
    public Ship(BattleshipUtils.ShipSpecs specs, boolean isVertical) {  
        this.specs = specs;
        this.isVertical = isVertical;
    }  
      
     public int getLength() {  
         return specs.length;   
    }  
    
    public int getType() {
        return type;
    }
        
    public boolean[] getWasHit() {  
        return wasHit;  
    }  

    public void setWasHit(boolean[] wasHit) {  
        this.wasHit = wasHit;  
    }
    
    public void setCellsOccupied(Cell[] cells) {
        this.cellsOccupied = cells;
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

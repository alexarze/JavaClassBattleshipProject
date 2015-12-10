public class Board {
    private int rows = 0;
    private int columns = 0;
    private Cell[][] cells;
    private Ship[] ships;
    private int numships = 0;
    
    public int getRows() {
        return rows;
    }
    
    public int getColumns() {
        return columns;
    }
    
    public Cell[][]  getCells(int i, int j) {
        return cells;
    }
   
    public Ship[] getShips() {
        return ships;
    }
    
    public void setShip(Ship[]  s) {
        ships = s;
    }
    
    public int getNumShips() {
        return numships;
    }
    
    public void setUp() {
        if (rows<1) {
            return;
        }
        if (columns<1) {
            return;
        }
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                cells[i][j] = new Cell();
            }
        }
    }
    
    public void display() {
        
    }
    
    public void placeShips() {
        
    }
}
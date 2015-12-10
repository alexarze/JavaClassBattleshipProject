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
        
    }
    
    public void display() {
        
    }
    
    public void placeShips() {
        
    }
}
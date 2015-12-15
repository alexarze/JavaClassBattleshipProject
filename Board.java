import java.util.*;

public class Board {
    private int rows = 0;
    private int columns = 0;
    private Cell[][] cells;
    private Ship[] ships;
    private int numShips = 0;
    
    public Board(BattleshipUtils.BoardSpecs specs){
        this.rows = specs.rows;
        this.columns = specs.cols;
        this.numShips = specs.numShips;
        this.cells = new Cell[rows][columns];
        this.ships = new Ship[this.numShips];
        
        System.out.println(this.rows);
        System.out.println(this.columns);
        System.out.println(this.numShips);
        
        
        this.setUp();
    }
    
    public int getRows() {
        return rows;
    }
    
    public int getColumns() {
        return columns;
    }
    
    public Cell getCell(int i, int j) {
        if (i >= 0 && j >= 0) {
            return cells[i][j];
        } else {
            return null;
        }
    }
   
    public Ship[] getShips() {
        return ships;
    }
    
    public void setShip(Ship[]  s) {
        ships = s;
    }
    
    public int getNumShips() {
        return numShips;
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
        printColumnHeaders();
        int rowNum = 0;
        for (Cell[] row : cells) {
            System.out.print(rowNum);
            for (Cell cell : row) {
                System.out.print(" " + cell.getSymbol());
            }
            System.out.println();
            rowNum++;
        }
    }
    
    private void printColumnHeaders() {
        //We need to lead with a blank space so that we make room for the row headers.
        System.out.print(" ");
        for (int i=0; i<columns; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
    }
    
    /*
     * Will need to add support for verticle ship placement.
     * Current version simply adds random ship per line.
     * May implement ArrayList to determine which cell combinations have been suggested already.
     */
    public void placeShips(ArrayList<Ship> shipsArray) {
        Random random = new Random();
        int i = 0;
        int j = 0;
        boolean foundCol = false;
        
        // find a space for each space
        for (i = 0; i < shipsArray.size(); i++){
            // reset
            boolean foundRow = false;
            int rowGuess = 0;
            int colGuess = 0;
            
            // debug
            System.out.println("Ship " + i + ":");
            // get a row with no ship
            while (foundRow == false){
                rowGuess = random.nextInt(this.getRows());
                
                // debug
                System.out.println("Row Guess: " + rowGuess);
                
                for (j = 0; j < this.getColumns(); j++){
                    // if there is a ship in a cell on the row
                    if (this.getCell(rowGuess, j).getHasShip() == true){
                        // debug
                        System.out.println("Row had ship");
                        
                        break;
                    }
                    // if there has been no ship on the row, found row
                    if (j == this.getColumns() - 1){
                        foundRow = true;
                    }
                }
            }
            
            // get a valid column
            colGuess = random.nextInt(this.getColumns() - shipsArray.get(i).getLength());
            
            // debug
            System.out.println("Column Guess: " + colGuess);
            
            // assign ship to cells and save assigned cells
            Cell[] cellsOccupied = new Cell[shipsArray.get(i).getLength()];
            for (j = 0; j < shipsArray.get(i).getLength(); j++){
                this.getCell(rowGuess, colGuess + j).setHasShip(true);
                this.getCell(rowGuess, colGuess + j).setActiveShip(shipsArray.get(i));
                cellsOccupied[j] = this.getCell(rowGuess, colGuess + j);
            }
            
            // assign ship in list of ships
            this.ships[i] = shipsArray.get(i);
            
            // assign cells to ship
            shipsArray.get(i).setCellsOccupied(cellsOccupied);
        }
        
    }
}
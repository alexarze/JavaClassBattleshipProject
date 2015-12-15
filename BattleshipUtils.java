/*
 *BattleshipUtils is a helper/utility class for the Battleship game.
 */
public class BattleshipUtils {
    
    // These are varaibles that are used to display the board.
    public static char DISPLAY_HIT = 'X';
    public static char DISPLAY_MISS = '_';
    public static char DISPLAY_UNGUESSED = '0';
    
    /*
     * This is an enumerator obect that defines the types of valid ships
     * and their corresponding sizes.
     */
    public enum ShipSpecs {
        AIRCRAFT_CARRIER (5),
        BATTLESHIP (4),
        SUBMARINE (3),
        DESTROYER (3),
        PATROL_BOAT (2);
        
        public final int length;
        ShipSpecs(int length) {
            this.length = length;
        }
    }
    
    /*
     * This is an enumerator object that defines the specs for three
     * different board sizes - defining the rows, columns and the appropriate
     * number of ships for that board size.
     */
    public enum BoardSpecs {
        SMALL_BOARD (5, 5, 3), //Any 3 random ships
        MEDIUM_BOARD (10, 10, 5),  //One of each ship
        LARGE_BOARD (40, 40, 10);  //Two of each ship
        
        public final int rows;
        public final int cols;
        public final int numShips;
        BoardSpecs(int rows, int cols, int numShips) {
            this.rows = rows;
            this.cols = cols;
            this.numShips = numShips;
        }
    }
}
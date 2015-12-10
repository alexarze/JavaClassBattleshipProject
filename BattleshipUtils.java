/*
 *BattleshipUtils is a helper/utility class for the Battleship game.
 */
public class BattleshipUtils {
    
    // These are varaibles that are used to display the board.
    public static char DISPLAY_HIT = 'X';
    public static char DISPLAY_MISS = '_';
    public static char DISPLAY_UNGUESSED = 'O';
    
    public enum ShipTypes {
        AIRCRAFT_CARRIER (5),
        BATTLESHIP (4),
        SUBMARINE (3),
        DESTROYER (3),
        PATROL_BOAT (2);
        
        public final int size;
        ShipTypes(int size) {
            this.size = size;
        }
    }
}
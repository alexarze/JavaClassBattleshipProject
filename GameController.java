import java.util.*;

public class GameController{
    
    private Player thePlayer;
    private Board theBoard;
    private Scanner userInput = new Scanner(System.in);
    
    public static void main(String[] args){
        GameController thisGame = new GameController();
        
        thisGame.startGame();
    }
    
    public void startGame(){
        int i = 0;
        
        // create Player
        System.out.println("What is your name? ");
        String playerName = userInput.nextLine();
        thePlayer = new Player(playerName);
        
        // create board
        theBoard = new Board(BattleshipUtils.BoardSpecs.MEDIUM_BOARD);
        
        // create ships (will be random in the future)
        ArrayList<Ship> shipsArray = new ArrayList<Ship>();
        shipsArray.add(new Ship(BattleshipUtils.ShipSpecs.AIRCRAFT_CARRIER, false));
        shipsArray.add(new Ship(BattleshipUtils.ShipSpecs.BATTLESHIP, false));
        shipsArray.add(new Ship(BattleshipUtils.ShipSpecs.SUBMARINE, false));
        shipsArray.add(new Ship(BattleshipUtils.ShipSpecs.DESTROYER, false));
        shipsArray.add(new Ship(BattleshipUtils.ShipSpecs.PATROL_BOAT, false));
        
        theBoard.placeShips(shipsArray);
    }
    
}

/* To Start Game:
 *  - Create Player
 *  - Create Board
 *  - Create Ships and give to Board to place
 *
 * To Get Input:
 *  - Ask for User Input
 *  - Parse User Input
 *  - Do Appropriate Action
 */
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
        this.printWelcome();
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
        theBoard.display();
        this.playGame();
    }
    
    protected void playGame() {
        boolean playing = true;
        while (playing) {
            boolean isNumeric = true;
            String delims = "[ ]";
            String[] guessTokens = guess.split(delims);
            
            // ask for guess
            System.out.println("What's your guess (row col)?");
            String guess = userInput.nextLine();
            
            // check if guesses are numeric
            for (String str:guessTokens) {
                if (isNumeric(str) == false) {
                    isNumeric = false;
                }
            }
            
            if (guessTokens.length == 2 && isNumeric == true) {
                this.makeGuess(Integer.parseInt(guessTokens[0]), Integer.parseInt(guessTokens[1]));
            }
            else if (guessTokens.length == 1 && guess.equalsIgnoreCase("quit")) {
                playing = false;
            }
            else {
                System.out.println("I don't understand.  Please make a guess like this: 3 1");
            }
        }
    }
    
    private void printWelcome() {
        System.out.println("Welcome to Battleship!");
        System.out.println("You can quit at any time by typing quit.");
    }
    
    private void makeGuess(int row, int col) {
        System.out.println("Making row guess: " + row);
        System.out.println("Making col guess: " + col);
        
        // add a player guess
        this.thePlayer.addGuess();
    }
    
    private void isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");
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
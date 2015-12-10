public class TestBattleshipUtils {
    public static void printShipSpecs() {
        for (BattleshipUtils.ShipSpecs type : BattleshipUtils.ShipSpecs.values()) {
            System.out.println(type + " has a length of " + type.length + ".");
        }        
    }
    
    public static void testShipSpecsLong() {
        boolean isPassing = false;
        BattleshipUtils.ShipSpecs shipSpecs = BattleshipUtils.ShipSpecs.SUBMARINE;
        
        switch (shipSpecs) {
            case AIRCRAFT_CARRIER:
                //We don't want to do anything here.
                break;
            case BATTLESHIP:
                //We don't want to do anything here.
                break;
            case SUBMARINE:
                isPassing = true;
                break;
            case DESTROYER:
                //We don't want to do anything here.
                break;
            case PATROL_BOAT:
                //We don't want to do anything here.
                break;
            default:
                //We don't want to do anything here.
        }
        
        System.out.println("testShipSpecsLong = pass " + isPassing);
    }

    public static void testShipSpecsShort() {
        boolean isPassing = false;
        BattleshipUtils.ShipSpecs shipSpecs = BattleshipUtils.ShipSpecs.PATROL_BOAT;
        
        switch (shipSpecs) {
            case PATROL_BOAT:
                isPassing = true;
                break;
            default:
                //We don't want to do anything here.
        }
        
        System.out.println("testShipSpecsShort pass = " + isPassing);
    }

    public static void printBoardSpecs() {
        for (BattleshipUtils.BoardSpecs specs : BattleshipUtils.BoardSpecs.values()) {
            System.out.println(specs + " is a " + specs.rows + "X" + specs.cols + " grid with " + specs.numShips + " ships.");
        }        
    }

    public static void main(String[] args) {
        TestBattleshipUtils.printShipSpecs();
        System.out.println("\n");
        TestBattleshipUtils.testShipSpecsLong();
        System.out.println("\n");
        TestBattleshipUtils.testShipSpecsShort();
        System.out.println("\n");
        TestBattleshipUtils.printBoardSpecs();
    }
}
public class TestBattleshipUtils {
    public static void testShipTypes() {
        for (BattleshipUtils.ShipTypes type : BattleshipUtils.ShipTypes.values()) {
            System.out.println(type + " has a size of " + type.size + ".");
        }        
    }
    public static void main(String[] args) {
        TestBattleshipUtils.testShipTypes();
    }
}
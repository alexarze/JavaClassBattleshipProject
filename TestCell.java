public class TestCell {
    public void setActiveShipToEmpty() { //void
        Ship testShip = null;
    }
    public void setActiveShip() {
        Ship testShip = new Ship(BattleshipUtils.ShipSpecs.PATROL_BOAT,false);
    }
    public void setsymbolToInvalid() {
        Cell symbol = null;
    }
    public void setsymbolToValid() {
        //Cell symbol = new Cell("O","X","N");
    }    
}
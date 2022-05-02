package battleships;

public class Main {
  public static void main(String[] args ) {
    GridSquare testGridSquare = new GridSquare();
    GridSquare testGridSquare2 = new GridSquare();
    Player testPlayer = new Player("TestFuck");
    testGridSquare.registerContact();
    String unoccupiedContact = testGridSquare.getSquareState();
    testGridSquare2.placeShip(testPlayer);
    testGridSquare2.registerContact();
    String occupiedContact = testGridSquare2.getSquareState();
    System.out.println("Unoccupied status:"+unoccupiedContact);
    System.out.println("Occupied status:"+occupiedContact);
  }
}

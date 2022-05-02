package battleships;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GridSquareTest {

  @org.junit.jupiter.api.Test
  public void testUnoccupiedContactRegister() {
    GridSquare testGridSquare = new GridSquare();
    testGridSquare.registerContact();
    String testGridSquareState = testGridSquare.getSquareState();
    assertTrue(testGridSquareState.equals("miss"));
  }

  @org.junit.jupiter.api.Test
  public void testOccupiedContactRegister() {
    GridSquare testGridSquare = new GridSquare();
    testGridSquare.registerContact();
    Player newPlayer = new Player("TestPlayer");
    testGridSquare.placeShip(newPlayer);
    String testGridSquareState = testGridSquare.getSquareState();
    String expectedOutput = "hit";
    assertTrue(testGridSquareState.equals(expectedOutput));
  }
}

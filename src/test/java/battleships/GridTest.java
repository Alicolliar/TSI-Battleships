package battleships;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class GridTest {

  @org.junit.jupiter.api.Test
  public void testGridCoOrdConversions() {
    String inputCoordString = "G9";
    int[] expectedOutput = {6, 8};
    assertArrayEquals(expectedOutput, Grid.convertedCoOrds(inputCoordString));
  }

  @org.junit.jupiter.api.Test
  public void testGridCreationAndStateRetrieval() {
    Grid testGrid = new Grid();
    String expectedOutput = "null";
    int[] pointSelect = {0,0};
    String actualOutput = testGrid.getSquare(pointSelect).getSquareState();
    assertTrue(actualOutput.equals(expectedOutput));
  }
}

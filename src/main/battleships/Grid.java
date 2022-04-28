package battleships;

public class Grid {
  private GridSquare battleshipGrid[][];
  private String[] alphabet = {"A","B","C","D","E","F","G","H","I","J"}
  public Grid() {
    for (int i = 0; i < 10; i++) {
      for (int q = 0; q < 10; q++) {
        battleshipGrid[i][q] = GridSquare();
      }
    }
  }
}

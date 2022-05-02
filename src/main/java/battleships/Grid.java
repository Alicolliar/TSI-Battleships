package battleships;

public class Grid {
  private GridSquare battleshipGrid[][];
  private static String[] alphabet = {"A","B","C","D","E","F","G","H","I","J"};

  public Grid() {
    battleshipGrid = new GridSquare[10][10];
    for (int i = 0; i < 10; i++) {
      for (int q = 0; q < 10; q++) {
        battleshipGrid[i][q] = new GridSquare();
      }
    }
  }

  public GridSquare getSquare(int[] convertedCoOrds) {
    return battleshipGrid[convertedCoOrds[0]][convertedCoOrds[1]];
  };

  public static int[] convertedCoOrds(String inputtedCoordString) {
    String xLetterCoOrd = inputtedCoordString.substring(0,1);
    int yCoOrd = Integer.parseInt(inputtedCoordString.substring(1))-1;
    int xCoOrd = 0;
    for (String i : alphabet) {
      if (i.equals(xLetterCoOrd)) {
        break;
      }
      xCoOrd++;
    }
    int[] coOrdSet = {xCoOrd, yCoOrd};
    return coOrdSet;
  }

  public static void main(String[] args) {
    Grid testGrid = new Grid();
  }
}

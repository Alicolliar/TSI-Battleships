package battleships;

public class GridSquare {
  String squareState; // If you've been hit, change to "hit", if a missed occurred it become "miss"
  Player owner; // Denotes the player that has a ship on the square (if there is no player with a ship here, it's null)

  public GridSquare() {
    squareState = "null";
    owner = null;
  }

  public void placeShip(Player newOwner) {
    owner = newOwner;
  }

  public Player getOwner() {
    return owner;
  }

  public String getSquareState() {
    return squareState;
  }

  public void registerContact() {
    if (owner == null) {
      squareState = "miss";
    } else {
      squareState = "hit";
    }
  }
}

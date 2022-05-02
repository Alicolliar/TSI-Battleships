package battleships;

public class Player {
  private String playerName;

  public Player(String newPlayerName) {
    playerName = newPlayerName;
  }

  public String getName()  {
    return playerName;
  }

  public String toString() {
    return playerName;
  }
}

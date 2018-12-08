class Bingo {
  private Player[] players;
  public Bingo(Player[] player) {
    this.players = player;
  }

  public String play(int number) {
    for (int i = 0; i < players.length; i++) {
      players[i].markNumber(number);
    }
    String allWinners = "";
    for (int i = 0; i < players.length; i++) {
      if (players[i].isWinner())
      allWinners = allWinners + players[i].getName() + " ";
    }
    return allWinners;
  }
}


class Card {
  private int[][] number;
  private boolean[][] marks = new boolean[5][5];
  public Card(int[][] number) {
    this.number = number;
  }
  public int getNumber(int row, int column) {
    return number[row - 1][column - 1];
  }
  public boolean isMarked(int row, int column) {
    return marks[row - 1][column - 1];
  }
  public void markNumber(int number) {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (this.number[i][j] == number) {
          this.marks[i][j] = true;
        }
      }
    }
  }
}

class Player {
  private String name;
  private Card[] cards;
  public Player(String name, Card[] cards) {
    this.name = name;
    this.cards = cards;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Card[] getCard() {
    return cards;
  }

  public void setCard(Card[] card) {
    this.cards = card;
  }

  public boolean isWinner() {
    boolean win = true;
    for (int i = 0; i < cards.length; i++) {
      for (int j = 0; j < 5; j++) {
        for (int k = 0; k < 5; k++) {
          win = win && cards[i].isMarked(j + 1, k + 1);
        }
        if (win == true) {
          return true;
        }
      }
    }
    return false;
  }
  public void markNumber(int number) {
    for (int i = 0; i < cards.length; i++) {
      cards[i].markNumber(number);
    }
  }
}

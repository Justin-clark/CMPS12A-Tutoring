import java.util.Scanner;

class Minesweeper {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    int[] bombRow = new int[10];
    int[] bombCol = new int[10];
    int rowSize = scanner.nextInt();
    int colSize = scanner.nextInt();
    int numBomb = scanner.nextInt();

    for(int i = 0; i < numBomb; i++) {
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        bombRow[i] = row;
        bombCol[i] = col;
    }

    for(int i = 0; i < rowSize; i++) {
      for(int j = 0; j < colSize; j++) {

        int neighbors = 0;
        boolean bomb = false;

        for(int x = 0; x < numBomb; x++) {

          if(bombCol[x] == j && bombRow[x] == i) {
            System.out.print("*");
            bomb = true;
            break;
          } else if(Math.abs(bombCol[x] - j) == 1 && Math.abs(bombRow[x] - i) == 1){
            neighbors++;
          } else if(Math.abs(bombCol[x] - j) == 0 && Math.abs(bombRow[x] - i) == 1){
            neighbors++;
          } else if(Math.abs(bombCol[x] - j) == 1 && Math.abs(bombRow[x] - i) == 0){
            neighbors++;
          }
        }

        if(!bomb) {
          System.out.print(neighbors);
        }
        if(j != (colSize - 1)) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }
}

import java.util.Scanner;

class Flip {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();

    if(x < 10) {//single digit

      System.out.println(x * 100);

    } else if(x > 9 && x < 100) { //double digit
      int counter = 0;
      int reversed = 0;

      if(x % 10 == 0) { // if number is divisable by 10
        System.out.println(x + "0");
      } else {

        while(counter != 2) { // reverse it normally
          reversed = x % 10;
          x = x / 10;
          System.out.print(reversed);
          counter++;
        }
        System.out.print("0");
      }

    } else { //triple digit

      int counter = 0;
      int reversed = 0;

      if(x % 10 == 0) { // if number is divisable by 10
        x = x / 10;
        if(x % 10 == 0) {
          System.out.println(x + "0");
        } else {
          reversed = x % 10;
          System.out.print(reversed);
          x = x / 10;
          System.out.print(x + "0");
        }
      } else {

        while(counter != 3) { // else reverse it normally
          reversed = x % 10;
          x = x / 10;
          System.out.print(reversed);
          counter++;
        }
      }
    }
  }
}

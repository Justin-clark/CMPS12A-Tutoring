import java.util.Scanner;

class Sequence {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);

    int first = scanner.nextInt();

    int second = scanner.nextInt();

    int third = scanner.nextInt();

    int terms = scanner.nextInt();

    System.out.print(first + " " + second + " " + third + " ");

    int patternOne = first - second;
    int patternTwo = second - third;

    for(int i = 2; i < terms-1; i++) {

      if(i % 2 == 0) {
        int next = third - patternOne;
        System.out.print(next + " ");
        third = next;
      } else {
        int next = third - patternTwo;
        System.out.print(next + " ");
        third = next;
      }

    }

  }
}

import java.util.Scanner;

class Narges {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
      String input = scanner.nextLine();

      char[] array = {'n','a','r','g','e','s'};

      int counter = 0;
      for(int i = 0; i < input.length(); i++) {
        char letter = input.charAt(i);

        if(array[counter] == letter) {
          counter++;
        }
      }
      if(counter > 5) {
        System.out.println("true");
      } else {
        System.out.println("false");
      }
    }
}

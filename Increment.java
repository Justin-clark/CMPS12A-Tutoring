import java.util.Scanner;

class Increment {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    int[] array = new int[20];
    int counter = 0;
    while(scanner.hasNextInt()) {
        int increase = scanner.nextInt();
        array[counter] = increase;
        if(counter != 0 && increase < array[counter-1]) {
          break;
        }
        counter++;
    }
    int add = 0;
    for(int i = 0; i < counter-1; i++) {
      add = add + (array[i+1] - array[i]);
    }
    if((counter-1) == 0) {
      System.out.println("0.00");
    } else {
      float avg = (float)add/(counter-1);
      System.out.printf("%.2f", avg);
    }

  }
}

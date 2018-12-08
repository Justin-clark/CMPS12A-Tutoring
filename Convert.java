import java.util.Scanner;

class Convert {
  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);

    int hr = scanner.nextInt();
    int min = scanner.nextInt();
    int dayOrNight = scanner.nextInt();

    if(dayOrNight == 1) { // am time
      if(hr < 10) {

        if(min < 10) {
          System.out.println("0" + hr + ":0" + min);
        } else {
          System.out.println("0" + hr + ":" + min);
        }

      } else {
        if(min < 10) {

          if(hr == 12) { // 12 o clock edge case
            System.out.println("00:0" + min);
          } else {
            System.out.println(hr + ":0" + min);
          }

        } else {
          if(hr == 12) { // 12 o clock edge case
            System.out.println("00:" + min);
          } else {
            System.out.println(hr + ":" + min);
          }
        }

      }

    } else {
      if(hr == 12) { // 12 0 clock edge case

        if(min < 10) {
          System.out.println(hr + ":0" + min);
        } else {
          System.out.println(hr + ":" + min);
        }

      } else {

        if(min < 10) {
          System.out.println(hr + 12 + ":0" + min);
        } else {
          System.out.println(hr + 12 + ":" + min);
        }

      }


    }
  }
}

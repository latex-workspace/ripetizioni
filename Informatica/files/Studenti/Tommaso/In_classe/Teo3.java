import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class Teo3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String s = scan.nextLine();

    System.out.println("hai inserito " + s);

    Random r = new Random();

    System.out.println("Intero casuale: " + r.nextInt(10));

  }
}

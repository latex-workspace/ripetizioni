import java.util.Scanner;
import java.util.Random;

class Teo6 {
  public static void main(String[] args) {
    // SCANNER
    /*
    Scanner scan = new Scanner(System.in);
    String linea = scan.nextLine();
    System.out.println("Il tuo input: " + linea);

    int letturaInt = scan.nextInt();
    System.out.println("Il tuo int: " + letturaInt);

    scan.close();
    */

    // RANDOM
    Random r = new Random();
    System.out.println(r.nextInt(5,10));
    System.out.println(r.nextFloat());
    System.out.println(r.nextFloat(5));
  }
}

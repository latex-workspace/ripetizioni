/**
 * Fattoriale
 */
public class Fattoriale {
  public static void main(String[] args) {
    System.out.println(fact(4));
  }

  public static int fact(int n) {
    int fact = 1;
    for (int i = n; i > 1; i--) {
      fact *= i;
    }

    return fact;
  }
}

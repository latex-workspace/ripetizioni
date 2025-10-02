/**
 * Overloading
 */
public class Overloading {
  public static void main(String[] args) {
    stampa();
    stampa("Input");
    stampa(5);
    int v[] = {1,2,3,4,3,2,1};
    System.out.println(stampa(v));

  }

  public static void stampa() {
    System.out.println("0 argomenti");
  }

  public static void stampa(String text) {
    System.out.println("Stampo ciò che mi è stato dato in input:\n" + text + "\n");
  }

  public static void stampa(int x) {
    for (int i = 0; i < x; i++) {
      System.out.println(i + 1);
    }
  }

  public static int stampa(int v[]){
    System.out.println("");
    for(int x : v)
      System.out.print(x + " ");
    return v.length;
  }
}

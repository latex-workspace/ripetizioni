/**
 * Inverti_matrice
 */
public class Stampa_matrice {

  public static void main(String[] args) {

    int m[][] = {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 }
    };

    stampa(m);

  }


  public static void stampa(int m[][]) {
    System.out.println();
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[0].length; j++) {
        System.out.print(m[i][j] + "\t");
      }
      System.out.println();
    }
  }

}

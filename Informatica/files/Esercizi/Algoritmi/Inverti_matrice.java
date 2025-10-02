/**
 * Inverti_matrice
 */
public class Inverti_matrice {

  public static void main(String[] args) {

    int m[][] = {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 10 },
        { 11, 12, 13, 14, 15 },
        { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 }
    };

    stampa(m);
    invert(m);
    stampa(m);

  }

  public static void invert(int m[][]) {

    if (m.length != m[0].length) {
      System.out.println("Errore, matrice non quadrata");
      return;
    }

    for (int i = 0; i < m.length; i++) {
      for (int j = i; j < m[0].length; j++) {

        int tmp = m[i][j];
        m[i][j] = m[j][i];
        m[j][i] = tmp;
      }
    }
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

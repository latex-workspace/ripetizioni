/**
 * Controlla_contenuto_vettore
 */
public class Controlla_contenuto_vettore {
  public static void main(String[] args) {

    int v1[] = { 11, 66, 3, 4, 77 };
    int v2[] = { 3, 66, 77, 11, 4 };

    System.out.println(check(v1, v2));

  }

  public static boolean check(int v1[], int v2[]) {
    int appoggio1[] = new int[100];
    int appoggio2[] = new int[100];
    // di default java inizializza tutto a zero

    if (v1.length != v2.length)
      return false;

    for (int i = 0; i < v1.length; i++) {
      appoggio1[v1[i]]++;
      appoggio2[v2[i]]++;
    }

    for (int i = 0; i < v1.length; i++) {
      if (appoggio1[i] != appoggio2[i])
        return false;
    }

    return true;

  }
}

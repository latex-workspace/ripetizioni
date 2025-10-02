/**
 * Massimo_vettore
 */
public class Massimo_vettore {

  public static void main(String[] args) {

    int v[] = { 7, 5, 8, 2, 11, 13, 11, 7 };
    System.out.println(max(v));
  }

  public static int max(int v[]) {
    int max = v[0];
    for (int i = 0; i < v.length; i++) {
      if (v[i] > max)
        max = v[i];
    }

    return max;
  }

}

/**
 * Massimo_ricorsivo
 */
public class Massimo_ricorsivo {
  public static void main(String[] args) {

    int v[] = { 4, 7, 3, -1 };
    System.out.println(max_wrapper(v));
  }

  public static int max_rec(int v[], int i) {

    if (i == v.length)
      return v[v.length - 1];

    return Math.max(v[i], max_rec(v, i + 1));
  }

  // funzione wrapper
  public static int max_wrapper(int v[]) {
    return max_rec(v, 0);
  }

}

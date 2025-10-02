import java.util.Random;

class Targa1 {
  //private static String targa = "ll-ccc-ll";

  public static String generate() {

    Random r = new Random();
    String alphabet = "abcdefghijklmnpqrstuvwxyzo";
    String c1 = "" + alphabet.charAt(r.nextInt(26));
    String c2 = "" + alphabet.charAt(r.nextInt(26));
    String lhs = c1 + c2;

    String c3 = "" + alphabet.charAt(r.nextInt(26));
    String c4 = "" + alphabet.charAt(r.nextInt(26));
    String rhs = c3 + c4;

    int center = r.nextInt(100, 1000);

    return lhs + "-" + center + "-" + rhs;
  }
}

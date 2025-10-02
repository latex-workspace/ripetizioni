/**
 * Massimo_vettore
 */
public class Compara_stringhe_2 {

  public static void main(String[] args) {


    System.out.println(compare("Matteo", "Mattia"));
    System.out.println(compare("Matteo", "Matteo"));
    System.out.println(compare("Mattia", "Matteo"));

  }

  public static int compare(String s1, String s2) {

    int i = 0;
    while (i < Math.min(s1.length(), s2.length())  && s1.charAt(i) == s2.charAt(i))
      i++;

    if (i == Math.min(s1.length(), s2.length())) {
      if (s1.length() == s2.length())
        return 0;

      if (s1.length() < s2.length())
        return -1;
      else
        return 1;

    }

    if (s1.charAt(i) < s2.charAt(i))
      return -1;

    return 1;

  }

}

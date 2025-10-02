/**
 * Massimo_vettore
 */
public class Compara_stringhe_1 {

  public static void main(String[] args) {

    char s1[] = { 'p', 'r', 'o', 'v', 'a' };
    char s2[] = { 'p', 'r', 'o', 'v', 'a' };

    System.out.println(equals(s1,s2)); 

    char s3[] = { 'p', 'r', 'o', 'v', 'e' };
    char s4[] = { 'p', 'r', 'o', 'v', 'a' };

    System.out.println(equals(s3,s4)); 
  }

  public static boolean equals(char s1[], char s2[]) {
    if (s1.length != s2.length)
      return false;
    for (int i = 0; i < s1.length; i++) {
      if (s1[i] != s2[i])
        return false;
    }
    return true;
  }

}

class Es1 {

  static void increment(int v[]) {
    for (int i = 0; i < v.length; i++)
      v[i] += 1;
  }

  static void print(int v[]) {
    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + " ");
    }
    System.out.println();
  }

  static void print(String v[]) {
    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + " ");
    }
    System.out.println();
  }

  static void print_even(int v[]) {

    for (int i = 0; i < v.length; i++) {
      if (v[i] % 2 == 0) {
        System.out.print(v[i] + " ");
      }
    }
    System.out.println();
  }

  static String[] filter1(String v[], int n) {
    String rv[] = new String[v.length];
    for (int i = 0; i < v.length; i++) {
      if (v[i].length() <= n) {
        rv[i] = v[i];
      } else {
        rv[i] = "/";
      }
    }

    return rv;
  }

  static String[] filter2(String v[], int n) {
    String rv[] = new String[v.length];
    int t = 0;
    for (int i = 0; i < v.length; i++) {

      if (v[i].length() <= n) {
        rv[t] = v[i];
        t++;
      }
    }

    return rv;
  }

  static String[] filter3(String v[], int n) {
    int size = 0;

    for (int i = 0; i < v.length; i++) {
      if (v[i].length() <= n) {
        size++;
      }
    }

    String rv[] = new String[size];
    int t = 0;
    for (int i = 0; i < v.length; i++) {
      if (v[i].length() <= n) {
        rv[t] = v[i];
        t++;
      }
    }

    return rv;
  }

  public static void main(String[] args) {
    int v1[] = { 1, 2, 3, 4 };
    String v2[] = { "ciao", "acqua", "casa" };
    int n = 5;
    print(filter1(v2, n));
    print(filter2(v2, n));
    print(filter3(v2, n));
    // increment(v1);
    // print(v1);
    // print_even(v1);
  }
}

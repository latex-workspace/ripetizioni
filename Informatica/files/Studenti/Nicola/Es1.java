class Es1 {

   static void incrementaVettore(int v[]) {

    for (int i = 0; i < v.length; i++) {
      v[i] = v[i] + 1;
      // v[i] += + 1;
      // v[i] ++;
    }

    System.out.print("[ ");
    for (int i = 0; i < 5; i++) {
      System.out.print(v[i] + " ");
    }
    System.out.println("]");

  }

  public static void main(String[] args) {
    // es1
    float a = 15;
    double b = 12.5;
    float c = -12;

    System.out.println(a + b + c);

    // es 2
    String name = "Nome";
    String surname = "Cognome";
    System.out.println(name + " " + surname);

    // es 3
    int v[] = { 1, 2, 3, 4, 5 };

    for (int i = 0; i < v.length; i++) {
      v[i] = v[i] + 1;
      // v[i] += + 1;
      // v[i] ++;
    }

    System.out.print("[ ");
    for (int i = 0; i < 5; i++) {
      System.out.print(v[i] + " ");
    }
    System.out.println("]");

    // es 4
    incrementaVettore(v);
    incrementaVettore(v);
  }
}

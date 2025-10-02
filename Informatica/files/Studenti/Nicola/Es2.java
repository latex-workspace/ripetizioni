class Es2 {
  static void f1(int x) {
    x++;
  }

  static void f2(int v[]) {
    v[0]++;
  }

  public static void main(String[] args) {

    int v[] = {0,0,0};
    int x = 0;

    f1(x);
    f2(v);

    System.out.println(v[0]);
    System.out.println(x);

  }
}

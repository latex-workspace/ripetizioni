class Teo1 {

  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();

    // System.out.println(a1.x);
    // System.out.println(a1.y);
    // a1.x = 0;
    // a1.y = 0;
    // System.out.println(a2.x);
    // System.out.println(a2.y);
    //
    // System.out.println(A.s);
    // System.out.println(A.s);
    // A.s = 24;
    // System.out.println(A.s);
    // System.out.println(A.s);

    // a1.stampa();
    // Util.area(3);

  }
}

class A {
  double x = 15;
  double y = 20;
  double z = x + y;
  static double s = 42;

  void stampa() {
    System.out.println("x:" + x + " y:" + y);
  }

  static void dosmth() {
    // stampa();
    // System.out.println(x);
  }

}

class Util {
  static float pi = 3.14f;

  static float area(int r) {
    return pi * r * r;
  }
}

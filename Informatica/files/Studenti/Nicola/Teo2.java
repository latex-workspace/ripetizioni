class Teo2 {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();

    /*
     * a1.staticx = 1;
     * a2.staticx = 2;
     * 
     * System.out.println(A.staticx);
     */

  }
}

class A {
  int x = 10;
  static int staticx = 20;

  public void f() {
    System.out.println("Stampo qualcosa");
  }

  public static void f2() {
    System.out.println("Stampo f2 " + staticx);
  }
}



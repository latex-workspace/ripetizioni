package com.mycompany.app;

/**
 * Es4
 */
public class Es4 {

  public static void run() {
    A a1 = new A(1); // a1.x = 1
    A a2 = new A("Hello"); // a2.x = 666
    A a3 = new A(2, "Hello"); // a3.x = 2
    System.out.println(a1.x + a2.x + a3.x + "");
    System.out.println("" + a1.x + a2.x + a3.x);

  }
  // output
  // Hello
  // Hello
  // 1 666 2

  private static class A {
    int x = 42;

    public A(int x) {
      this.x = x;
    }

    public A(String s) {
      System.out.println(s);
      this.x = 666;
    }

    public A(int x, String s) {
      System.out.println(s);
      this.x = x;
    }
  }
}

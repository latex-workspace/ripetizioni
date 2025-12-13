package com.mycompany.app;

/**
 * ValueReference
 */
public class ValueReference {
  public static void f(int x) {
    x = -1;
  }

  public static void f(A a) {
    a.x = -1;
  }

  public static void run() {
    int x = 42;
    int y = x; // value copy
    y = 0;
    System.out.println("x: " + x + " y: " + y);

    A a = new A(42);
    A b = a; // reference copy
    b.x = 0;
    System.out.println("a.x: " + a.x + " b.x: " + b.x);

    int xx = 42;
    A aa = new A(42);
    f(xx);
    f(aa);

    System.out.println(xx);
    System.out.println(aa.x);
  }

  public static class A {
    int x;

    public A(int x) {
      this.x = x;
    }
  }

}

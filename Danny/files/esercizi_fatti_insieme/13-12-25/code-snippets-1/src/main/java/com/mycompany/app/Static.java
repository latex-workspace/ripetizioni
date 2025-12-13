package com.mycompany.app;

/**
 * Static
 */
public class Static {

  public static void run() {
    // Util.printX();

    A a1 = new A();
    A a2 = new A();
    A a3 = new A();

    A.printCount();

    B b1 = new B(); // this == b1
    B b2 = new B();
  }

  public static class Util {

    static int x = 42;

    public static void printX() {
      System.out.println("x: " + x);
    }

    public static void util2() {
      System.out.println("questa è util 2");
    }
  }

  public static class B {
    int x;

    public void stampa(int x) {
      System.out.println(this.x);
    }
  }

  public static class A {
    private static int count = 0;

    public static void printCount() {
      System.out.println(count);
    }

    public A() {
      count++;
    }
  }
}

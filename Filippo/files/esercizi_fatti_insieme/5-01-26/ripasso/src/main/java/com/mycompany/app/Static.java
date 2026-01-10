package com.mycompany.app;

/**
 * Static
 */
public class Static {

  static public void run() {
    A a1 = new A();
    A a2 = new A();
    a1.x = 10;
    a2.x = 15;
    A.static_x = 20;
    A.static_x = 25;

    System.out.println("a1.x: " + a1.x);
    System.out.println("a2.x: " + a2.x);
    System.out.println("a1.static_x: " + A.static_x);
    System.out.println("a2.static_x: " + A.static_x);

    A.static_f();

    Util.sum(2, 3);
    Util.mul(2, 3);
    Util.printX();

    B b1 = new B();
    B b2 = new B();
    B b3 = new B();

    System.out.println("Total B count: " + B.counter);
  }
}

class B {
  static int counter = 0;

  public B() {
    B.counter += 1;
  }
}

class Util {
  static int x = 42;

  static String white = "\\x101";
  static String blue = "\\x101";

  public static int sum(int x1, int x2) {
    return x1 + x2;
  }

  public static int mul(int x1, int x2) {
    return x1 * x2;
  }

  public static void printX() {
    System.out.println("print x: " + Util.x);
  }
}

class A {
  int x = 0;
  static int static_x = 0;

  public void f() {
    System.out.println("f");
  }

  static public void static_f() {
    System.out.println("static f");
  }
}

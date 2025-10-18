package com.mycompany.app;

public class Main {

  public static void main(String[] args) {
    X x = new X();
    X y = new X();
    X z = new X();

    X.x = 10;
    x.y = 11;

    x.f();
    x.g();

    System.out.println(x);
    System.out.println(y);

    Util.util1();
    Util.util2();

    System.out.println(Util.APP_NAME);
    System.out.println("instanceCount: " + X.instanceCount);

  }

}

class X {
  static int x = 1;
  int y = 2;

  static int instanceCount = 0;

  public X() {
    instanceCount++;
  }

  void f() {
    System.out.println("Funzione f");
  }

  void g() {
    System.out.println("Funzione g");
  }

  public String toString() {
    return "X{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }

}

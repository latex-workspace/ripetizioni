package com.mycompany.app;

public class Esempio1 {
  public static void run() {
    A a1 = new A();
    A a2 = new A();

    System.out.println(a1); // x = 1 y = 1
    System.out.println(a2); // x = 1 y = 2

  }
}

class A {
  int x = 0;
  static int y = 0;

  public A() {
    x++;
    y++;
  }

  @Override
  public String toString() {
    return "x: " + x + "\t y: " + y;
  }
}

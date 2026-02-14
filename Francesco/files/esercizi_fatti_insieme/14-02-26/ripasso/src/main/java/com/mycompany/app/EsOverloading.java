package com.mycompany.app;

class A {
  int x;

  public A() {
    this.x = 0;
  }

  public A(int x) {
    this.x = x;
  }

  public void f() {
    System.out.println("A");
  }

  public void f(int x) {
    System.out.println("B");
  }
}

public class EsOverloading {

  public static void run() {
    A a1 = new A();
    A a2 = new A(42);
    System.out.println(a1.x);
    System.out.println(a2.x);

    a1.f();
    a1.f(5);

  }

}

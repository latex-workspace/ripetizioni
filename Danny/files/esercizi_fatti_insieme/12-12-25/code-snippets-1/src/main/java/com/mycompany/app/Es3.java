package com.mycompany.app;

/**
 * Es3
 * Descrivi l'output/l'errore che si ottiene chiamando il metodo run()
 */

public class Es3 {

  public static void run() {
    A a = new A(10);
    // B b = new B();
    System.out.println(a.x);
    // System.out.println(b.x);
  }

  private static class A {
    int x;

    public A(int x) {
      this.x = x;
    }
  }

  private static class B {

    int x = 15;

    public B(int x) {
      System.out.println(x);
    }
  }
}

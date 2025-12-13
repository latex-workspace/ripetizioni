package com.mycompany.app;

/**
 * Es2
 * Descrivi l'output/l'errore che si ottiene chiamando il metodo run()
 */
public class Es2 {

  public static void run() {
    A a = new A(10);
    System.out.println(a.x);
  }

  private static class A {
    int x = 42;

    public A(int x) {
      x = x;
    }
  }

}

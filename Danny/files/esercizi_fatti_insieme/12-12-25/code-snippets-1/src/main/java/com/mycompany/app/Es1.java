package com.mycompany.app;

/**
 * Es1
 * Descrivi l'output/l'errore che si ottiene chiamando il metodo run()
 */
public class Es1 {

  public static void run() {
    A a = new A();
    System.out.println(a.x);
  }

  private static class A {
    int x = 42;

  }
}

package com.mycompany.app;

/**
 * Ovearloading
 */
public class Ovearloading {
  public static void stampa() {
    System.out.println("stampa");
  }

  public static void stampa(int x) {
    System.out.println("stampa1 " + x);
  }

  public static void stampa(String s) {
    System.out.println("stampa1 " + s);
  }

  public static int f() {
    return 42;
  }

  public static void f(int x) {
  }

  public static void run() {
    stampa();
    stampa(1);
    stampa("ss");
  }
}

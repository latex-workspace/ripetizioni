package com.mycompany.app;

/**
 * Es1
 */
public class Es1 {

  public static void es1() {
    f1();
    System.out.println("Main terminato correttamente");
  }

  public static void f1() {
    f2();
    System.out.println("f1");
  }

  public static void f2() {
    try {
      f3();
    } catch (RuntimeException e) {
      System.out.println("Eccezione catturata in f2: " + e.getMessage());
      // Pararsi il culo
    } // f3();
    System.out.println("f2");
  }

  public static void f3() {
    if (true)
      throw new RuntimeException("Eccezione f3");
    System.out.println("f3");
  }

}

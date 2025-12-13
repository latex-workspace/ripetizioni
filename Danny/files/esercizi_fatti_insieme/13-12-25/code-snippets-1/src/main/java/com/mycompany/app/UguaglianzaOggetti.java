package com.mycompany.app;

/**
 * UguaglianzaOggetti
 */
public class UguaglianzaOggetti {

  public static void run() {
    int x = 2;
    int y = 3;

    if (x == y) {
      System.out.println("x e y sono uguali");
    } else {
      System.out.println("x e y sono diversi");
    }

    A a1 = new A(5);
    A a2 = a1;
    System.out.println(a1);
    System.out.println(a2);
    if (a1 == a2) {
      System.out.println("a1 e a2 sono lo stesso oggetto");
    } else {
      System.out.println("a1 e a2 sono oggetti diversi");
    }

    a1.x = 10;
    System.out.println(a1.x);
    System.out.println(a2.x);

  }

  private static class A {
    int x;

    public A(int x) {
      this.x = x;
    }
  }
}

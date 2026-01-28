package com.mycompany.app;

public class Esempio2 {
  public static void f(){
    System.out.println("Hello from f");
  }

  public static void run() {
    f();

    // System.out.println(v.get(0));

    // A.stampa();
    // A.stampa(2);

    // System.out.println(2 + 2);
    // System.out.println("prova" + "prova2");
  }
}

class A {
  public static void stampa() {
    System.out.println("stampa1");
  }

  public static void stampa(int x) {
    System.out.println("stampa2");
  }
}

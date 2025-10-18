package com.mycompany.app;

public class Main {

  public static void main(String[] args) {
    // A a = new A();
    // A b = new A();
  }
}

class A {

  private int nonStaticVar;
  private static int staticVar;

  public static void staticFunc() {
    System.out.println("My x: " + staticVar);
    // System.out.println("My x: " + nonStaticVar); // errore
  }

  public void nonStaticFunc() {
    System.out.println("My x: " + staticVar);
    System.out.println("My x: " + nonStaticVar);
  }
}

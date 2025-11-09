package com.mycompany.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void doSomething(int x) {
    x = 42;
  }

  public static void doSomething(String s) {
    s = "Goodbye";
  }

  public static void doSomething(A a) {
    a.x = 100;
  }

  public static void doSomething(Integer x) {
    x = 42;
  }

  public static void main(String[] args) {

    int x = 35;
    String s = "Hello";
    A a = new A(42);

    doSomething(x);
    doSomething(s);
    doSomething(a);

    System.out.println(x);
    System.out.println(s);
    System.out.println(a.x);
  }
}

class A {
  int x = 42;

  A(int x) {
    this.x = x;
  }
}

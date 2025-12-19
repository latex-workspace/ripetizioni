package com.mycompany.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * Es1
 */
public class Es1 {

  public static void run() {

    // ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
    // System.out.println(mat.get(1).get(1));
    // int n = 5;
    // int m = 7;

    // for (int i = 0; i < n; i++) {
    // mat.add(new ArrayList<Integer>());
    // for (int j = 0; j < m; j++) {
    // mat.get(i).add(0);
    // }
    // }
    //
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // System.out.print(mat.get(i).get(j) + " ");
    // }
    // System.out.println();
    // }

    // System.out.println(numbers.get(1));
    // int size = 5;
    // for (int i = 0; i < size; i++)
    // numbers.add(0);

    // Test test = new Test();
    // test.addNumber(5);
    // test.removeNumber(5);

    // A a = new A();
    // B b = new B();
    //
    // System.out.println(a.a);
    // a.f();
    //
    // System.out.println(b.a);
    // b.f();

    try {
      // Codice che tira eccezioni
      // throw new IOException("Errore di runtime");
      // Path path = Path.of("nonexistentfile.txt");
      // File file = new File("nonexistentfile.txt");

    } catch (RuntimeException e) {
      System.out.println(e);
    }

  }

  public static class A {
    int a = 42;

    public void f() {
      System.out.println("Ciao da A");
    }
  }

  public static class B extends A {

    @Override
    public void f() {
      System.out.println("Ciao da B");
    }
  }
}

// class Test {
// ArrayList<Integer> numbers = new ArrayList<>();
//
// public Test() {
// }
//
// public void addNumber(int n) {
// numbers.add(n);
// }
//
// public void removeNumber(int n) {
// numbers.remove(Integer.valueOf(n));
// }
//
// }

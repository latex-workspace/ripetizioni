package com.mycompany.app;

import java.util.ArrayList;

/**
 * Singleton
 */
public class Factory {

  private Factory() {
  }

  public static A create(String s, int upper_bound) {

    A a = new A();

    if (s.equals("even")) {
      for (int i = 0; i < upper_bound; i++)
        if (i % 2 == 0)
          a.list.add(i);
    } else if (s.equals("odd")) {
      for (int i = 0; i < upper_bound; i++)
        if (i % 2 != 0)
          a.list.add(i);
    } else if (s.equals("all")) {
      for (int i = 0; i < upper_bound; i++)
        a.list.add(i);
    } else {
      throw new IllegalArgumentException("Tipo non valido");
    }
    return a;
  }

  public static void run() {
    A even = Factory.create("even", 10);
    A odd = Factory.create("odd", 10);
    A all = Factory.create("all", 10);
    
    System.out.println(even);
    System.out.println(odd);
    System.out.println(all);
  }

  private static class A {
    ArrayList<Integer> list = new ArrayList<>();

    @Override
    public String toString() {
      return list.toString();
    }
  }
}

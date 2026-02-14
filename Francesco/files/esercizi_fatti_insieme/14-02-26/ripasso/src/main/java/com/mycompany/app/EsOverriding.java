package com.mycompany.app;

// class A {
//   int x;
//
//   public A() {
//     this.x = 0;
//   }
//
//   public A(int x) {
//     this.x = x;
//   }
//
//   public void f() {
//     System.out.println("A");
//   }
//
//   public void f(int x) {
//     System.out.println("B");
//   }
// }

public class EsOverriding {

  public static void run() {

    A a = new A();
    B b = new B();

    System.out.println(a.x);
    a.f();

    System.out.println(b.x);
    b.f();
    b.g();

  }

  static class A {
    int x;

    public void f() {
      System.out.println("f from A");
    }

    @Override
    public String toString() {
      return "A{" +
          "x=" + x +
          '}';
    }
  }

  static class B extends A {

    @Override
    public void f() {
      System.out.println("f from B");
    }

    public void g() {
      System.out.println("g from B");
    }
  }

}

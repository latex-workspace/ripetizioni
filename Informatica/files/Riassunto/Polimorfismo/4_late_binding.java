class Main {
  public static void main(String[] args) {

    A a = new A();
    A b = new B();
    A c = new C();

    a.fun();
    b.fun();
    c.fun();

    A x = new B();

    x.fun();

  }
}

class A {
  void fun() {
    System.out.println("A");
  }
}

class B extends A {
  void fun() {
    System.out.println("B");
  }
}

class C extends B {
  void fun() {
    System.out.println("C");
  }
}

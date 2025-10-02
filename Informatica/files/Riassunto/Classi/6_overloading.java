
class Main {
  public static void main(String[] args) {

    B b = new B();

    b.fun();
    b.fun(42);
    b.fun("Prova");
  }
}

class A {
  void fun() {
    System.out.println("Overload 1");
  }

  void fun(int a) {
    System.out.println("Overload 2: " + a);
  }
}

class B extends A {

  void fun(String a) {
    System.out.println("Overload 3: " + a);
  }
}

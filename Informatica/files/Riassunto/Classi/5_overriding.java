
class Main {
  public static void main(String[] args) {

    A b = new B();
    A c = new C();

    b.fun();
    c.fun();
  }
}

class A {
  void fun() {
    System.out.println("Funzione classe A");
  }
}

class B extends A{
  void fun() {
    System.out.println("Funzione classe B");
  }
}

class C extends A {
  void fun() {
    System.out.println("Funzione classe C");
  }
}

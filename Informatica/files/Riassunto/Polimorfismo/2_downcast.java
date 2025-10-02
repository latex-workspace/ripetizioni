class Main {
  public static void main(String[] args) {
    B b = new B();

    A a = (A) b; // upcasting, funziona sempre se b estende a



    A ab = new B();

    ab.funA();
    if (ab instanceof B)
      ((B) ab).funB(); // downcasting, fallisce a runtime se non vale A instanceof B

  }
}

class A {
  void funA() {
    System.out.println("A");
  }
}

class B extends A {
  void funB() {
    System.out.println("B");
  }
}

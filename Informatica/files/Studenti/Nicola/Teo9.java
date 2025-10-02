class Teo9 {
  public static void main(String[] args) {
    // A ab = new B();
    // ab.stampa();
    //
    // A a = new A();
    // a.stampa();
    // a.stampa(5);
    //
    B b = new B();
    b.stampa();
    b.stampa(15);
    b.stampa("Stringa ");

  }
}

class A {
  // public void stampa() {
  // System.out.println("Stampa A");
  // }

  public void stampa(int x) {
    System.out.println("Stampa A: " + x);
  }
  public void stampa(String s) {
    System.out.println("Stampa STRINGA" + s);
  }
}

class B extends A {
  public void stampa() {
    System.out.println("Stampa B");
  }
}

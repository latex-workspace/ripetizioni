class Main {
  public static void main(String[] args) {

    // AbstractClass ac = new AbstractClass(); // Errore! non posso istanziare
    // classi astratte

    A a = new A();
    B b = new B();
    
    b.stampa();

    a.implementa();
    b.implementa();


    AbstractClass aa = new A();
    AbstractClass bb = new B();

    aa.implementa();
    bb.implementa();
  }
}

abstract class AbstractClass {
  String att = "String di classe astratta";

  void stampa() {
    System.out.println(att);
  }

  abstract void  implementa();
}

class A extends AbstractClass {
  @Override
  void implementa() {
    System.out.println("Implementazione di A");
  }
}

class B extends AbstractClass {
  @Override
  void implementa() {
    System.out.println("Implementazione di B");
  }
}

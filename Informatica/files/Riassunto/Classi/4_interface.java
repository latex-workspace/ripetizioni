class Main {
  public static void main(String[] args) {
    A a = new A();
    a.fun1();
    a.fun2();
    a.fun3();
  }
}

interface Interfaccia1 {
  String dato1 = "dato da interfaccia 1"; // questi dati sono STATICI e FINAL

  default void fun1() {
    System.out.println("Funzionalità dall'inerfaccia 1");
  }
}

interface Interfaccia2 {
  String dato2 = "dato da interfaccia 2"; // questi dati sono STATICI e FINAL

  default void fun2() {
    System.out.println("Funzionalità dall'inerfaccia 2");
  }
}

interface Interfaccia3 {
  String dato3 = "dato da interfaccia 2"; // questi dati sono STATICI e FINAL

  void fun3();
}

class A implements Interfaccia1, Interfaccia2, Interfaccia3 {
  @Override
  public void fun3() {
    System.out.println("Funzionalità dall'interfaccia 3, overridata");
  }
}

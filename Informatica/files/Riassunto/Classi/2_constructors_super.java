
class Main {
  public static void main(String[] args) {

    C c = new C("a", "b", "c");
    c.print_attributes();

  }
}

class A {
  String attA = "string a";

  public A(String attA) {
    System.out.println("Costruttore A");
    this.attA = attA;
  }

  void print_attributes() {
    System.out.println(attA);
  }
}

class B extends A {
  String attB = "string b";

  public B(String attA, String attB) {
    super(attA); // CHIAMA costrutture della super classe A
    System.out.println("Costruttore B");
    this.attB = attB;
  }

  void print_attributes() {
    super.print_attributes();
    System.out.println(attB);
  }
}

class C extends B {
  String attC = "string C";

  public C(String attA, String attB, String attC) {
    super(attA, attB); // CHIAMA costrutture della super classe B
    System.out.println("Costruttore C");
    this.attC = attC;
  }

  void print_attributes() {
    super.print_attributes();
    System.out.println(attC);
  }

}

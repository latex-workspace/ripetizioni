class Teo7 {
  public static void main(String[] args) {
    A a = new A(10);
    B b = new B(10, 20);

    System.out.println(a.a);
    System.out.println(b.b);
    System.out.println(b.a);

    a.fa();
    b.fb();
    b.fa();
  }
}

class A {
  int a = 10;

  public A(int a) {
    System.out.println("Costruttore A");
    this.a = a;
  }

  public void fa() {
    System.out.println("Hellow from a");
  }
}

class B extends A {
  int b = 20;

  public B(int a, int b) {
    super(a);
    System.out.println("Costruttore B");
    this.b = b;
  }

  public void fb() {
    System.out.println("Hellow from b");
  }
}

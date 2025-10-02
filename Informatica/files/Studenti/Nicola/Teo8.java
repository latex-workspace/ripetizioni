class Teo8 {
  public static void main(String[] args) {
    // A a = new A();
    // a.f();
    //
    // B b = new B();
    // b.f();

    A v[] = new A[4];
    v[0] = new A();
    v[1] = new A();
    v[2] = new B();
    v[3] = new B();

    for (int i = 0; i < v.length; i++)
      v[i].f();

    // ESEMPIO FORME
    Forma forme[] = new Forma[4];
    forme[0] = new Triangolo(10, 10);
    forme[1] = new Triangolo(10, 10);
    forme[2] = new Rettangolo(10, 10);
    forme[3] = new Rettangolo(10, 10);

    for (int i = 0; i < forme.length; i++)
      System.out.println(forme[i].area());
  }

}
class A {
  public void f() {
    System.out.println("A");
  }
}

class B extends A {
  public void f() {
    System.out.println("B");
  }
}

class Forma {
  String colore;

  public Forma(String colore) {
    this.colore = colore;
  }

  public double area() {
    return -1;
  }
}

class Triangolo extends Forma {
  double base;
  double altezza;

  public Triangolo(double base, double altezza) {
    super("Bianco");
    this.base = base;
    this.altezza = altezza;
  }

  public double area() {
    return base * altezza / 2;
  }
}

class Rettangolo extends Forma {

  double lato1;
  double lato2;

  public Rettangolo(double lato1, double lato2) {
    super("Bianco");
    this.lato1 = lato1;
    this.lato2 = lato2;
  }

  public double area() {
    return lato1 * lato2;
  }

}

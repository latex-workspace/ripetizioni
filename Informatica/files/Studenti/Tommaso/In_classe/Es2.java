class Es2 {
  public static void main(String[] args) {
    A a1 = new A();
    a1.modify(3);
    a1.print();
    // ----------------
    //
    B b1 = new B(1, 2, "Ciao dal costruttore");

    b1.setX1(15);
    b1.setX2(16);

    System.out.println(b1.getX1() + " " + b1.getX2());
  }
}

class A {
  private int evenNumber = 2;

  void print() {
    System.out.println(evenNumber);
  }

  void modify(int evenNumber) {
    if (evenNumber % 2 == 0)
      this.evenNumber = evenNumber;
  }

}

class B {
  private int x1;
  private int x2;
  private boolean acceso = true;

  public B(int x1, int x2, String s) {
    this.x1 = x1;
    this.x2 = x2;
    System.out.println(s);
  }

  public int getX1() {
    return x1;
  }

  public void setX1(int x1) {
    this.x1 = x1;
  }

  public int getX2() {
    return x2;
  }

  public void setX2(int x2) {
    this.x2 = x2;
  }

  public boolean isAcceso() {
    return acceso;
  }

  public void setAcceso(boolean acceso) {
    this.acceso = acceso;
  }

}

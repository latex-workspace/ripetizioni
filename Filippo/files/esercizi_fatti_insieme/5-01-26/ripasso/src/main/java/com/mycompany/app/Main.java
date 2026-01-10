package com.mycompany.app;

public class Main {

  public static void main(String[] args) {
    Static.run();
    // int x = 2;
    // EvenNumber a = new EvenNumber();
    // a.setX(3);
    // a.printPower(3);
  }

}

class EvenNumber {
  private int x;

  public EvenNumber() {
    this.x = 2;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    if (x % 2 == 0)
      this.x = x;
  }

  private int pow(int n) {
    int rv = this.x;
    for (int i = 0; i < n; i++) {
      rv *= this.x;
    }
    return rv;
  }

  public void printPower(int n) {
    System.out.println(this.x + "^" + n + "= " + this.pow(n));
  }

}

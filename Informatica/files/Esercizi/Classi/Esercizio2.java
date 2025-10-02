public class Esercizio2 {
  public static void main(String[] args) {
    A a1 = new A(5);
    A a2 = new A(5);
    System.out.println(a1.x + a2.x);
  }
}

class A {
  static int x = 0;

  public A(int x) {
    A.x += x;
  }
}

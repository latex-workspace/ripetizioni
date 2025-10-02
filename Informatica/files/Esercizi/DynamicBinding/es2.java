public class es2 {

  public static void main(String[] args) {
    A x = new B();
    stampa(x);
  }

  public static void stampa(A a) {
    System.out.println("A");
  }

  public static void stampa(B b) {
    System.out.println("A");
  }

}

class A {
}

class B extends A {
}

public class es3 {

  public static void main(String[] args) {
    A x = new B();
    ((B)x).funcB();
  }

}

class A {
  public void funcA() {
    System.out.println("funcA");
  }
}

class B extends A {
  public void funcB() {
    System.out.println("funcB");
  }

}

class Teo3 {
  public static void main(String[] args) {

    A a1 = new A();
    A a2 = new A();
    A a3 = new A();


    /* a1.registerInstance();
    a2.registerInstance();
    a3.registerInstance(); */

    System.out.println(A.count);
  }
}

class A {
  static int count = 0;

  public A() {
    System.out.println("Creo istanza");
    count++;
  }

  /* public void registerInstance() {
    count++;
  } */

}


class Main {
  public static void main(String[] args) {
    A a = new A();
    a.f1();
    a.f1(5);
  }
}

class A {

  int f1() {
    System.out.println("1");
    return 1;
  }

  float f1(int i) {
    System.out.println("2");
    return 1f;
  }
}

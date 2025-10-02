
class Main {
  public static void main(String[] args) {

    A a = new A();
    B b = new B();

    A ab = new B(); // tipo statico: A tipo dinamico: B
    ab.fa();

  }

}

class A {
  int a;
  void fa(){
    System.out.println("fa da A");
  }
}

class B extends A {
  int b;
  void fa(){
    System.out.println("fa da B");
  }
  void fb(){}
}

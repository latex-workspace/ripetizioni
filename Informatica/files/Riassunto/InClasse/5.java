class Main{
  public static void main(String[] args){

    A x = new B();
    x.f();
    
  }
}

class A{
  void f(){
    System.out.println("A");
  }
}
class B extends A{
  void f(){
    System.out.println("B");
  }
}
class C extends B{
  void f(){
    System.out.println("C");
  }
}

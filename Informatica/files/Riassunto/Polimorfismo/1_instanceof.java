class Main{
  public static void main(String[] args){
    A a = new A();
    A b = new B();
    A c = new C();

    System.out.println(a instanceof A);
    System.out.println(b instanceof A);
    System.out.println(c instanceof A);

    System.out.println();

    System.out.println(c instanceof B);
    System.out.println(a instanceof B);
    System.out.println(a instanceof C);
  }
}

class A{

}
class B extends A{

}
class C extends A{

}

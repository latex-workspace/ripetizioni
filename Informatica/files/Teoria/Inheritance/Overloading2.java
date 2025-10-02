/**
 * Overloading2
 */
public class Overloading2 {

    public static void main(String[] args){
    B b = new B();
    b.stampa(5);
    b.stampa("stringa");
      
    }
}

class A {
  void stampa(String s){
    System.out.println(s);
  }
}

class B extends A{
  void stampa(int x){
    System.out.println(x);
  }
}

/**
 * prova5
 */
public class Overriding {

    public static void main(String[] args){
      A a = new A();
      a.stampa();
      A b = new B();
    }
}

class A{
  void stampa(){
    System.out.println("Hello from A");
  }
}

class B extends A{
  void stampa(){
    System.out.println("Hello from B");
  }
}

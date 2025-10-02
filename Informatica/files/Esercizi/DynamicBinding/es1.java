public class es1 {

   public static void main(String[] args){
    A a = new B();
    a.stampa();
   }

}

class A {
  public void stampa(){
    System.out.println("A");
  }
}

class B extends A{
  public void stampa(){
    System.out.println("B");
  }
}

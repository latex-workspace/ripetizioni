class Main{
  public static void main(String[] args){
    // downcasting
    A x1 = new B();
    System.out.println(((B)x1).toString());

    //
    B x2 = new B();
    System.out.println(((A)x2).toString()); // perchè stampa B[]?
    
  }
}

class A{

  @Override
  public String toString() {
    return "A []";
  }

}
class B extends A{

  @Override
  public String toString() {
    return "B []";
  }
}

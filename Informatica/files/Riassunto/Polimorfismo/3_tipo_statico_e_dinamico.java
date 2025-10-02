class Main {
  public static void main(String[] args) {
    A ab = new B(); // tipo statico A e dinamico B
    
    // B b = new B();
    // (A) b) ha tipo statico A e dinamico B

    fun(ab);
    fun((B)ab);

    B b = new B();
    fun(b);
    fun((A)b);

  }

  public static void fun(A a) {
    System.out.println("Tipo statico a");
  }

  public static void fun(B b) {
    System.out.println("Tipo statico b");
  }
}

class A {
}

class B extends A {
}

class prova5 {
  public static void main(String[] args) {
    A a = new A();
    a.stampa();
    a.stampa("stringa");
    a.stampa(14);
  }
}

class A {

  public void stampa() {
    System.out.println("A");
  }

  public void stampa(String s) {
    System.out.println(s);
  }

  public int stampa(int x) {
    System.out.println(x);
    return 42;
  }

  public String stampa(int x, int x2) {
    System.out.println(x);
    return "safad";
  }


}



class Es3 {
  public static void main(String[] args) {
    A ciao = new A(61);
    System.out.println(ciao.getAttribute());
    
    ciao.setAttribute(16);
    System.out.println(ciao.getAttribute());
    ciao.setAttribute(15);
    System.out.println(ciao.getAttribute());
    /*
     * ciao.stampa();
     * System.out.println(ciao.attribute);
     * ciao.attribute = 12;
     * System.out.println(ciao.attribute);
     */
  }
}

class A {
  private int attribute;

  public int getAttribute() {
    return attribute;
  }

  public void setAttribute(int x) {
    if (x % 2 == 0)
      this.attribute = x;
    else
      System.out.println("Errore, x non è pari");
  }

  public A(int attribute) {
    System.out.println("Costruttore chiamato con parametro x = " + attribute);
    this.attribute = attribute;
  }

  void stampa() {
    System.out.println("Classe A: " + attribute);
  }
}

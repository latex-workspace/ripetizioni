class Main {
  public static void main(String[] args) {
    MyClass a = new MyClass(42, "Prova");

    // chiamo metodo
    a.printInfos();
    a.computeSomething(10);

    // accedo ad attributi
    System.out.println(a.att1);
    System.out.println(a.att2);

  }
}

class MyClass {
  int att1 = 12;
  String att2 = "Stringa";

  public MyClass(int att1, String att2) {
    this.att1 = att1;
    this.att2 = att2;
  }

  void printInfos() {
    System.out.println("MyClass: " + att1 + " " + att2);
  }

  void computeSomething(int r) {
    System.out.println("Calcolo area cerchio: " + r * r * 3.14);
  }

}

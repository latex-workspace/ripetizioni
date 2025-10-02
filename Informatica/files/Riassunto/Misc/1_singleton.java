class Main {
  public static void main(String[] args) {
    Singleton s = Singleton.getInstance();
    s.doSomething();
    s.some_value = 42;

    Singleton s2 = Singleton.getInstance();
    s2.doSomething();

  }
}

class Singleton {
  private static Singleton instance = null;

  int some_value = 15;

  void doSomething() {
    System.out.println("Singleton function " + some_value);
  }

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null)
      instance = new Singleton();
    return instance;
  }

}

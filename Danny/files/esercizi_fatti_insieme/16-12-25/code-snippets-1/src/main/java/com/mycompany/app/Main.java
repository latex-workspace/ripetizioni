package com.mycompany.app;

/**
 * Hello world!
 */
public class Main {

  // ========================================
  // ESERCIZIO 1: Static vs Instance
  // ========================================
  static class Counter {
    static int staticCount = 0;
    int instanceCount = 0;

    Counter() {
      staticCount++;
      instanceCount++;
    }

    void printCounts() {
      System.out.println("Static: " + staticCount + ", Instance: " + instanceCount);
    }
  }

  public static void esercizio1_StaticVsInstance() {
    System.out.println("=== ESERCIZIO 1: Static vs Instance ===");
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();

    c1.printCounts();
    c2.printCounts();
    c3.printCounts();

    c1.instanceCount = 10;
    Counter.staticCount = 100;

    c1.printCounts();
    c2.printCounts();
    c3.printCounts();
    System.out.println();
  }

  // ========================================
  // ESERCIZIO 2: Overloading without Inheritance
  // ========================================
  static class Calculator {
    int compute(int a, int b) {
      System.out.print("int, int -> ");
      return a + b;
    }

    double compute(double a, double b) {
      System.out.print("double, double -> ");
      return a + b;
    }

    int compute(int a, int b, int c) {
      System.out.print("int, int, int -> ");
      return a + b + c;
    }

    String compute(String a, String b) {
      System.out.print("String, String -> ");
      return a + b;
    }
  }

  public static void esercizio2_Overloading() {
    System.out.println("=== ESERCIZIO 2: Overloading ===");
    Calculator calc = new Calculator();

    System.out.println(calc.compute(5, 10));
    System.out.println(calc.compute(5.5, 10.5));
    System.out.println(calc.compute(5, 10, 15));
    System.out.println(calc.compute("Hello", "World"));

    int x = 5;
    double y = 10.0;
    System.out.println(calc.compute(x, (int) y));
    System.out.println(calc.compute((double) x, y));
    System.out.println();
  }

  // ========================================
  // ESERCIZIO 3: Pass by Value/Reference
  // ========================================
  static class Box {
    int value;

    Box(int value) {
      this.value = value;
    }
  }

  static void modifyPrimitive(int num) {
    num = num * 2;
    System.out.println("Dentro modifyPrimitive: " + num);
  }

  static void modifyObject(Box box) {
    box.value = box.value * 2;
    System.out.println("Dentro modifyObject:  " + box.value);
  }

  static void reassignObject(Box box) {
    box = new Box(999);
    System.out.println("Dentro reassignObject: " + box.value);
  }

  public static void esercizio3_PassByValue() {
    System.out.println("=== ESERCIZIO 3: Pass by Value/Reference ===");

    int num = 10;
    System.out.println("Prima di modifyPrimitive: " + num);
    modifyPrimitive(num);
    System.out.println("Dopo modifyPrimitive: " + num);

    Box box1 = new Box(20);
    System.out.println("Prima di modifyObject: " + box1.value);
    modifyObject(box1);
    System.out.println("Dopo modifyObject: " + box1.value);

    Box box2 = new Box(30);
    System.out.println("Prima di reassignObject:  " + box2.value);
    reassignObject(box2);
    System.out.println("Dopo reassignObject: " + box2.value);
    System.out.println();
  }

  // ========================================
  // ESERCIZIO 4: Variable Scoping
  // ========================================
  static int globalVar = 100;

  // public static void esercizio4_VariableScoping() {
  // System.out.println("=== ESERCIZIO 4: Variable Scoping ===");
  //
  // int localVar = 50;
  // System.out.println("1. globalVar: " + globalVar + ", localVar: " + localVar);
  //
  // {
  // int blockVar = 25;
  // globalVar = 200;
  // System.out.println("2. globalVar: " + globalVar + ", localVar: " + localVar +
  // ", blockVar: " + blockVar);
  //
  // int localVar = 75; // shadowing
  // System.out.println("3. localVar nel blocco: " + localVar);
  // }
  //
  // System.out.println("4. globalVar: " + globalVar + ", localVar: " + localVar);
  // // System.out.println(blockVar); // ERRORE: blockVar non è visibile qui
  //
  // for (int i = 0; i < 3; i++) {
  // int loopVar = i * 10;
  // System.out.println("5. i: " + i + ", loopVar: " + loopVar);
  // }
  //
  // // System.out.println(i); // ERRORE: i non è visibile qui
  // System.out.println("6. globalVar finale: " + globalVar);
  // System.out.println();
  // }

  // ========================================
  // ESERCIZIO 5: General Code Snippets (Mix di concetti)
  // ========================================
  static class Player {
    static String gameName = "SuperGame";
    String playerName;
    int score;

    Player(String name) {
      this.playerName = name;
      this.score = 0;
    }

    void addScore(int points) {
      score += points;
    }

    void addScore(int points, int bonus) {
      score += points + bonus;
    }

    static void changeGame(String newName) {
      gameName = newName;
    }

    void printInfo() {
      System.out.println(playerName + " - Score: " + score + " - Game: " + gameName);
    }
  }

  static void modifyScore(Player p, int newScore) {
    p.score = newScore;
  }

  public static void esercizio5_GeneralSnippets() {
    System.out.println("=== ESERCIZIO 5: General Code Snippets ===");

    Player p1 = new Player("Alice");
    Player p2 = new Player("Bob");

    p1.addScore(10); // 10
    p2.addScore(20, 5); // 25

    p1.printInfo();
    p2.printInfo();

    Player.changeGame("MegaGame");

    p1.printInfo();
    p2.printInfo();

    modifyScore(p1, 100);
    p1.printInfo();

    int tempScore = p2.score;
    modifyScore(p2, tempScore);
    p2.printInfo();

    System.out.println("Game name: " + Player.gameName);
    System.out.println();
  }

  // ========================================
  // MAIN - Esegui tutti gli esercizi
  // ========================================
  public static void main(String[] args) {
    // esercizio1_StaticVsInstance();
    // esercizio2_Overloading();
    // esercizio3_PassByValue();
    // esercizio4_VariableScoping();
    // esercizio5_GeneralSnippets();

    Es1.run();
  }
}

package com.mycompany.app;

// enum Direction {
//   UP("Su", 1), DOWN("Giu", 3), LEFT("Sinistra", 2), RIGHT("Destra", 4);
//
//   private final String ita;
//   private final int val;
//
//   private Direction(String ita, int val) {
//     this.ita = ita;
//     this.val = val;
//   }
// }

enum Direction {
  UP(1), DOWN(3), LEFT(2), RIGHT(4);

  private final int int_value;

  private Direction(int value) {
    this.int_value = value;
  }

  public void print() {
    System.out.println("ENUM");
  }

  public int getIntValue() {
    return int_value;
  }

  // @Override
  // public String toString() {
  // return "Direction{" +
  // "int_value=" + int_value +
  // '}';
  // }
}

class DirectionC {

  public static final DirectionC UP = new DirectionC(1);
  public static final DirectionC DOWN = new DirectionC(3);
  public static final DirectionC LEFT = new DirectionC(2);
  public static final DirectionC RIGHT = new DirectionC(4);

  private int int_value;

  private DirectionC(int value) {
    this.int_value = value;
  }

  public void print() {
    System.out.println("CLASS");
  }
}

enum Day {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

/**
 * Enums
 */
public class EsEnum {

  public static void run() {
    Direction d = Direction.UP;
    DirectionC d1 = DirectionC.UP;

    d.print();
    d1.print();

    System.out.println(d.getIntValue());

    String s = "UP";
    s.trim();
    s.toUpperCase();

    // System.out.println(Direction.values()[2]);
    // for (Direction dd : Direction.values())
    // System.out.println(dd);

  }
}

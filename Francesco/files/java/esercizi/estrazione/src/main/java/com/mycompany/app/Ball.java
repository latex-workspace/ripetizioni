package com.mycompany.app;

enum Color {
  RED, YELLOW, GREEN;

  public static Color fromString(String name) {
    if (name == null)
      return null;
    try {
      return Color.valueOf(name.trim().toUpperCase());
    } catch (IllegalArgumentException e) {
      return null;
    }
  }
}

class Ball {
  Color color;
  int number;

  public Ball(Color color, int number) {
    this.color = color;
    this.number = number;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}

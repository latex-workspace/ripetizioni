package com.mycompany.app;

enum Color {
  RED("Questo è colore rosso"), YELLOW("Questo è colore rosso"), GREEN("Questo è colore rosso");

  private String description;

  private Color(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String toString() {
    return this.description;
  }

  public static Color fromString(String color) {
    if (color.equalsIgnoreCase("RED"))
      return Color.RED;
    else if (color.equalsIgnoreCase("YELLOW"))
      return Color.YELLOW;
    else if (color.equalsIgnoreCase("GREEN"))
      return Color.GREEN;
    else
      throw new IllegalArgumentException("Color must be RED, YELLOW or GREEN");
  }

  public static Color fromString2(String color) {
    try {
      return Color.valueOf(color.toUpperCase());
    } catch (IllegalArgumentException e) {
      return null;
    }
  }

}

public class Ball {
  private Color color;
  private int n;

  public Ball(Color color, int n) {
    this.color = color;
    this.n = n;
    if (!(n >= 1 && n <= 9))
      throw new IllegalArgumentException("Number must be between 1 and 9");
  }

  public Ball(String color, int n) {
    Color c = Color.fromString2(color);
    if (c == null)
      throw new IllegalArgumentException("Color must be RED, YELLOW or GREEN");
    if (!(n >= 1 && n <= 9))
      throw new IllegalArgumentException("Number must be between 1 and 9");

    this.color = c;
    this.n = n;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

}

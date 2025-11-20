package com.mycompany.app;

public class Rettangolo {
  // private double vx1;
  // private double vy1;
  private Punto bottomLeft;

  // private double vy2;
  // private double vx2;
  private Punto topRight;

  public Rettangolo(Punto p1, Punto p2) {
    this.bottomLeft = new Punto(Math.min(p1.getX(), p2.getX()), Math.min(p1.getY(), p2.getY()));
    this.topRight = new Punto(Math.max(p1.getX(), p2.getX()), Math.max(p1.getY(), p2.getY()));
  }

  public Punto getBottomLeft() {
    return bottomLeft;
  }

  public Punto getTopRight() {
    return topRight;
  }

  @Override
  public String toString() {
    return "Rettangolo{" + "bottomLeft=" + bottomLeft + ", topRight=" + topRight + '}';
  }

}

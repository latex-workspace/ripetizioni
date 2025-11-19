package com.mycompany.app;

public class Cerchio {
  private Punto centro;
  private double raggio;

  public Cerchio(Punto centro, double raggio) {
    this.centro = centro;
    this.raggio = Math.abs(raggio);
  }

  public Punto getCentro() {
    return centro;
  }

  public double getRaggio() {
    return raggio;
  }

  @Override
  public String toString() {
    return "Cerchio{" + "centro=" + centro + ", raggio=" + raggio + '}';
  }

}

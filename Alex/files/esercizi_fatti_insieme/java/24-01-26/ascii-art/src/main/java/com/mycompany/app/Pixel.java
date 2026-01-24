package com.mycompany.app;

/**
 * Pixel
 */
public class Pixel {
  private int r;
  private int g;
  private int b;

  public Pixel(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }

  public int getR() {
    return r;
  }

  public void setR(int r) {
    this.r = r;
  }

  public int getG() {
    return g;
  }

  public void setG(int g) {
    this.g = g;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int grayscale() {
    return (int) Math.round(0.299 * r + 0.587 * g + 0.114 * b);
  }

  public Pixel toBlackAndWhite() {
    int grayscale = (int) Math.round(0.299 * r + 0.587 * g + 0.114 * b);
    return new Pixel(grayscale, grayscale, grayscale);
  }

}

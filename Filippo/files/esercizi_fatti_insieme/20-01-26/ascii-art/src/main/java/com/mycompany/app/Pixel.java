package com.mycompany.app;

/**
 * Pixel
 */
public class Pixel {

  static final char[] ASCII_CHARS = { ' ', '.', ':', '!', '@', '#' };
  int r;
  int g;
  int b;

  public Pixel(int r, int g, int b) {
    this.r = r;
    this.g = g;
    this.b = b;
  }

  public Pixel toBackAndWhite() {
    int grayscale = (int) Math.round(0.299 * r + 0.587 * g + 0.114 * b);
    return new Pixel(grayscale, grayscale, grayscale);
  }

  public char toAscii(int maxColor) {
    Pixel whitePixel = toBackAndWhite();
    int grayscale = whitePixel.r; // da 0 a maxColor
    grayscale = maxColor - grayscale; // 0 = bianco, maxColor = nero
    int asciiIndex = Math.round(((float) grayscale / maxColor) * (ASCII_CHARS.length - 1));
    return ASCII_CHARS[asciiIndex];
  }

  @Override
  public String toString() {
    return r + " " + g + " " + b;
  }

}

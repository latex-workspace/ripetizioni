package com.mycompany.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Image
 */
public class Image {

  private int width, height, maxColor;
  private Pixel[][] m;

  // carica immagine da file ppm p3
  public Image(String filePath) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File(filePath));
    scanner.next();
    width = scanner.nextInt();
    height = scanner.nextInt();
    maxColor = scanner.nextInt();

    m = new Pixel[height][width];

    // for (int i = 0; i < width * height; i++) {
    // int r = scanner.nextInt();
    // int g = scanner.nextInt();
    // int b = scanner.nextInt();
    // Pixel pixel = new Pixel(r, g, b);
    //
    // int riga = i / width;
    // int colonna = i % width;
    // m[riga][colonna] = pixel;
    // }
    // in alternativa

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        Pixel pixel = new Pixel(r, g, b);
        m[i][j] = pixel;
      }
    }

  }

  // salva immagine in file ppm p3
  public void saveToFile(String filePath) throws IOException {
    PrintWriter writer = new PrintWriter(new FileWriter(filePath, false));
    writer.println("P3");
    writer.println(width + " " + height);
    writer.println(maxColor);
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        writer.print(m[i][j].getR() + " " + m[i][j].getG() + " " + m[i][j].getB() + " ");
      }
      writer.print("\n");
    }
    writer.close();
  }

  public void toBlackAndWhite() {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        m[i][j] = m[i][j].toBlackAndWhite();
      }
    }
  }

  public char[][] getAsciiArt() {
    char gradient[] = { ' ', '.', '-', ':', '=', '+', '*', '%', '@', '#' };
    char asciiArt[][] = new char[height][width];

    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        int grayscale = m[i][j].grayscale();
        int index = Math.round((1 - (float) grayscale / maxColor) * (gradient.length - 1));
        asciiArt[i][j] = gradient[index];
      }
    }
    return asciiArt;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getMaxColor() {
    return maxColor;
  }

  public void setMaxColor(int maxColor) {
    this.maxColor = maxColor;
  }

  public Pixel[][] getM() {
    return m;
  }

  public void setM(Pixel[][] m) {
    this.m = m;
  }

}

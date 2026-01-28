package com.mycompany.app;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class Main {
  public static void main(String[] args) {
    String inputFile = "files/mike-tyson.ppm";
    String outputFile = "files/mike-tyson.ppm";

    try (Scanner scanner = new Scanner(new File(inputFile))) {
      scanner.skip("\\s*P3\\s+");
      int width = scanner.nextInt();
      int height = scanner.nextInt();
      int maxColor = scanner.nextInt();
      int pixelsCount = width * height;
      Pixel[] pixels = new Pixel[pixelsCount];

      while (scanner.hasNextInt()) {
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        Pixel pixel = new Pixel(r, g, b);
      }

    } catch (IOException e) {
      System.out.println("Cannot open input file: " + e.getMessage());
    }
  }
}

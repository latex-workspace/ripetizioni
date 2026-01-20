package com.mycompany.app;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1. Carico file in memoria
 * 2. Converto in scala di grigi (double grayscale = 0.299 * r + 0.587 * g +
 * 0.114 * b)
 * 3. Associo un carratere ascii ad ogni intervallo della scal di grigi
 * " " "." ":" "!" "@" "#"
 */

public class Main {
  public static void main(String[] args) {
    String inputFile = "files/mike-tyson.ppm";
    String outputFile = "files/mike-tyson.txt";

    try (Scanner scanner = new Scanner(new File(inputFile))) {
      scanner.next();
      // scanner.skip("\\s*P3\\s*");
      int width = scanner.nextInt();
      int height = scanner.nextInt();
      int maxColor = scanner.nextInt();
      int pixelCount = width * height;
      Pixel[] pixels = new Pixel[pixelCount];

      for (int i = 0; i < pixelCount; i++) {
        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();
        Pixel pixel = new Pixel(r, g, b);
        pixels[i] = pixel;
      }

      {
        StringBuilder sb = new StringBuilder();
        sb.append("P3\n")
            .append(width).append(" ").append(height).append("\n")
            .append(maxColor).append("\n");

        for (Pixel pixel : pixels)
          sb.append(pixel.toBackAndWhite().toString()).append(" ");

        Files.writeString(Path.of("files/mike-tyson-wb.ppm"), sb.toString(),
            StandardOpenOption.CREATE,
            StandardOpenOption.TRUNCATE_EXISTING);
      }

      {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
          for (int j = 0; j < width; j++) {
            sb.append(pixels[i * width + j].toAscii(maxColor));
          }
          sb.append("\n");
        }

        Files.writeString(Path.of(outputFile), sb.toString(),
            StandardOpenOption.CREATE,
            StandardOpenOption.TRUNCATE_EXISTING);
      }

    } catch (IOException e) {
      System.out.println("Cannot open input file: " + e.getMessage());
    }

    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    //
    // try (Scanner scanner = new Scanner(new File(inputFile))) {
    // scanner.skip("\\s*P3\\s+");
    // int width = scanner.nextInt();
    // int height = scanner.nextInt();
    // int maxColor = scanner.nextInt();
    // int pixelsCount = width * height;
    //
    // Pixel[] pixels = new Pixel[pixelsCount];
    // int index = 0;
    //
    // while (scanner.hasNextInt()) {
    // int r = scanner.nextInt();
    // int g = scanner.nextInt();
    // int b = scanner.nextInt();
    // Pixel pixel = new Pixel(r, g, b);
    // pixels[index++] = pixel;
    // }
    //
    // StringBuilder sb = new StringBuilder();
    // sb.append("P3\n")
    // .append(width).append(" ").append(height).append("\n")
    // .append(maxColor).append("\n");
    //
    // for (Pixel pixel : pixels) {
    // int grayscale = (int) (0.299 * pixel.r + 0.587 * pixel.g + 0.114 * pixel.b);
    // sb.append(grayscale).append(" ")
    // .append(grayscale).append(" ")
    // .append(grayscale).append("\n");
    // }
    //
    // Files.writeString(Path.of("files/myte-tyson-wb.ppm"), sb.toString(),
    // StandardOpenOption.CREATE,
    // StandardOpenOption.TRUNCATE_EXISTING);
    // // Use APPEND if you want to add, but for an image you usually want to
    // // overwrite.
    //
    // } catch (IOException e) {
    // System.out.println("Cannot open input file: " + e.getMessage());
    // }
  }
}

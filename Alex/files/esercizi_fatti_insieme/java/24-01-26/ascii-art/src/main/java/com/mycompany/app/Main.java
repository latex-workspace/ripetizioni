package com.mycompany.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

/**
 * Hello world!
 */
public class Main {
  public static void main(String[] args) {
    String inputFile = "files/mike-tyson.ppm";
    String outputFile = "files/mike-tyson.txt";
    int width, height, maxColor;

    try {
      Image img = new Image(inputFile);
      // img.toBlackAndWhite();
      // img.saveToFile("files/mike-tyson-bw.ppm");
      char asciiArt[][] = img.getAsciiArt();
      byte[] asciiArtBytes = new byte[img.getHeight() * (img.getWidth() + 1)];
      int index = 0;
      for (int i = 0; i < img.getHeight(); i++) {
        for (int j = 0; j < img.getWidth(); j++) {
          asciiArtBytes[index++] = (byte) asciiArt[i][j];
        }
        asciiArtBytes[index++] = (byte) '\n';
      }

      Files.write(Paths.get(outputFile), asciiArtBytes, StandardOpenOption.CREATE);
    }

    catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

package com.mycompany.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class Main {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(new File("file.txt"))) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
        // Process the line
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

  }
}

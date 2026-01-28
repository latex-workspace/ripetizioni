package com.mycompany.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 */
public class Main {
  public static void main(String[] args) {

    f1();

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

  public static void f1() {
    System.out.println("Hello World!");

    if (true)
      throw new RuntimeException("Excepcion en f1");

    System.out.println("Post eccezione");
  }
}

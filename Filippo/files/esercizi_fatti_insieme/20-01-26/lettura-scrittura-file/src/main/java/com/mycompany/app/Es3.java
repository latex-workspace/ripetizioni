package com.mycompany.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Es2
 */
public class Es3 {

  public static void run() {

    method1();
    method2();

  }

  static void method1() {

    try (Scanner scanner = new Scanner(new File("input.txt"))) {
      int x = scanner.nextInt();
      String s = scanner.next();
      String line = scanner.nextLine();

      // while(scanner.hasNextLine()) {
      // System.out.println(scanner.nextLine());
      // }

    } catch (Exception e) {
      e.printStackTrace();
    }
    try (PrintWriter writer = new PrintWriter(new FileWriter("esempio.txt", true))) {
      writer.println("Riga aggiunta!");
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  static void method2() {
    try {
      // String content = new
      // String(Files.readAllBytes(Paths.get("path/to/file.txt")));
      List<String> lines = Files.readAllLines(Paths.get("path/to/file.txt"));
    } catch (IOException e) {
      e.printStackTrace();
    }
    try {
      // String lines[] = { "Prima riga", "Seconda riga", "Terza riga" };
      // Files.write(
      // Paths.get("esempio.txt"),
      // lines,
      // StandardOpenOption.APPEND);

      String content = "psadfaskdfkasf";
      Files.writeString(
          Paths.get("esempio.txt"),
          content,
          StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

package com.mycompany.app;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

/**
 * HelloScanner
 */
public class HelloFiles {

  public static void run() {
    try {
      String content = new String(Files.readAllBytes(Paths.get("files/input.txt")));
      System.out.println("File content '" + content + "'");

      List<String> lines = Files.readAllLines(Paths.get("files/input.txt"));
      System.out.println("Content list '" + lines + "'");
    } catch (Exception e) {
      e.printStackTrace();
    }

    String nuovaRiga1 = "riga 1";
    String nuovaRiga2 = "riga 2";
    try {
      Files.write(
          Paths.get("files/output.txt"),
          Arrays.asList(nuovaRiga1, nuovaRiga2),
          StandardOpenOption.CREATE);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}

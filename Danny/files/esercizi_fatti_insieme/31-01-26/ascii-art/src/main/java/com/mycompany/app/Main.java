package com.mycompany.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 */
public class Main {

  public static void main(String[] args) throws IOException {

    // Files.writeString(Paths.get("file.txt"), "prova",
    // StandardOpenOption.TRUNCATE_EXISTING);
    //
    // String lines[] = { "prova", "prova" };
    // ArrayList<String> list = new ArrayList<>(Arrays.asList(lines));
    //
    // Files.write(Paths.get("file.txt"), Arrays.asList(lines),
    // StandardOpenOption.TRUNCATE_EXISTING);
    // Files.write(Paths.get("file.txt"), list,
    // StandardOpenOption.TRUNCATE_EXISTING);
    //
    // System.out.println(Files.readString(Paths.get("file.txt")));

    // LocalDate today = LocalDate.now();
    // LocalDateTime now = LocalDateTime.now();
    //
    // LocalDate someDay = LocalDate.of(2026, 11, 26);
    // LocalDateTime someTime = LocalDateTime.of(2026, 11, 26, 3, 30, 15);
    //
    // String date = "26/02/2026 15:30:45";
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy
    // HH:mm:ss");
    //
    // LocalDateTime parsedDateTime = LocalDateTime.parse(date, formatter);
    // LocalDate parsedDate = LocalDate.parse(date, formatter);

    // ArrayList<SomeClass> list = new ArrayList<>();
    // list.sort((o1, o2) -> <criterio ordering>);

    // ArrayList<String> lines = new ArrayList<>(Arrays.asList("linea1", "linea2"));
    // System.out.println(String.join("+", lines));

    System.out.println(System.getProperty("user.dir"));
    // Paths.get("file.txt");

  }
}

enum Direction {
  UP("Su", 1), DOWN("Giù", 3), LEFT("Sinistra", 2), RIGHT("Destra", 4);

  private final String ita;
  private final int val;

  private Direction(String ita, int val) {
    this.ita = ita;
    this.val = val;
  }

  public String getIta() {
    return ita;
  }

  public int getVal() {
    return val;
  }

}

// class SomeClass {
// }

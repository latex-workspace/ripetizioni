package com.mycompany.app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * EsDate
 */
public class EsDate {

  public static void run() {
    LocalDate today = LocalDate.now(); // solo data
    LocalDateTime now = LocalDateTime.now(); // data e ora

    LocalDate someDay = LocalDate.of(2026, 11, 26);
    LocalDateTime someTime = LocalDateTime.of(2026, 11, 26, 3, 30, 15);
    // Conversione da stringa a data; formatter uguale per LocalDateTime e LocalDate

    String date = "26/02/2026 15:30:45";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    LocalDateTime parsedDateTime = LocalDateTime.parse(date, formatter);
    LocalDate parsedDate = LocalDate.parse(date, formatter);

    System.out.println(formatter.format(today));
  }
}

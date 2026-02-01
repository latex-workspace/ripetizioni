package com.mycompany.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class Main {
  public static void main(String[] args) {

    Gestore gestore = new Gestore("files/utenti.txt", "files/attivita.txt", "files/prenotazione.txt", true);
    System.out.println(gestore);

  }
}

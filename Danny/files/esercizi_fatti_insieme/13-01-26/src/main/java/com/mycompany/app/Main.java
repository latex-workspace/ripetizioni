package com.mycompany.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Hello world!
 */
public class Main {
  public static void main(String[] args) {
    // String dataStr = "11/10/2005";
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    // LocalDate date = LocalDate.parse(dataStr, formatter);
    // System.out.println(date);

    ArrayList<Utente> utenti = Gestore.loadUtenti("files/utenti.txt");
    ArrayList<Attivita> attivita = Gestore.loadAttivita("files/attivita.txt");
    ArrayList<Prenotazione> prenotazioni = Gestore.loadPrenotazioni("files/prenotazione.txt");

    System.out.println(utenti);
    System.out.println(attivita);
    System.out.println(prenotazioni);
  }
}

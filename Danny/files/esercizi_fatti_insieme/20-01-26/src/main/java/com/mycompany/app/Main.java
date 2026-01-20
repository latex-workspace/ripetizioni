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

    // ArrayList<Utente> utenti = Gestore.loadUtenti("files/utenti.txt");
    // ArrayList<Attivita> attivita = Gestore.loadAttivita("files/attivita.txt");
    // ArrayList<Prenotazione> prenotazioni =
    // Gestore.loadPrenotazioni("files/prenotazione.txt");

    // System.out.println(utenti);
    // System.out.println(attivita);
    // System.out.println(prenotazioni);

    Gestore gestore = new Gestore("files/utenti.txt", "files/attivita.txt", "files/prenotazione.txt", true);
    // gestore.stampaAttivitaDisponibili();
    // gestore.stampaPrenotazioni();
    System.out
        .println("Prenotazioni di francesco gallo: " + gestore.getPrenotazioniByEmail("francesco.gallo@example.com"));
    ;
    System.out
        .println("Prenotazioni di mario rossi: " + gestore.getPrenotazioniByEmail("mario.rossi@example.com"));
    ;

    Prenotazione p = new Prenotazione("chiara.moretti@example.com", "Danza", LocalDate.parse("2027-01-02"));
    System.out.println(gestore.aggiungiPrenotazione(p));

  }
}

package com.mycompany.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Gestore {
  // Utente già presente!

  public static ArrayList<Utente> loadUtenti(String filePath) {
    ArrayList<Utente> utenti = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(Paths.get(filePath));
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      for (String line : lines) {
        String[] parti = line.split(",");
        for (int i = 0; i < parti.length; i++)
          parti[i] = parti[i].strip();
        String nome = parti[0];
        String cognome = parti[1];
        LocalDate dataNascita = LocalDate.parse(parti[2], formatter);
        long telefono = Long.parseLong(parti[3]);
        String email = parti[4];
        Utente user = new Utente(nome, cognome, dataNascita, telefono, email);
        utenti.add(user);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return utenti;
  }

  public static ArrayList<Attivita> loadAttivita(String filePath) {
    ArrayList<Attivita> lista = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(Paths.get(filePath));
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
      for (String line : lines) {
        String[] parti = line.split(",");
        for (int i = 0; i < parti.length; i++)
          parti[i] = parti[i].strip();
        String nome = parti[0];
        int capacita = Integer.parseInt(parti[1]);
        LocalDateTime inizio = LocalDateTime.parse(parti[2], formatter);
        LocalDateTime fine = LocalDateTime.parse(parti[3], formatter);
        Attivita attivita = new Attivita(nome, capacita, inizio, fine);
        lista.add(attivita);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lista;
  }

  public static ArrayList<Prenotazione> loadPrenotazioni(String filePath) {
    ArrayList<Prenotazione> lista = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(Paths.get(filePath));
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      for (String line : lines) {
        String[] parti = line.split(",");
        for (int i = 0; i < parti.length; i++)
          parti[i] = parti[i].strip();
        String nomeUtente = parti[0];
        String nomeAttivita = parti[1];
        LocalDate dataPrenotazione = LocalDate.parse(parti[2], formatter);
        Prenotazione p = new Prenotazione(nomeUtente, nomeAttivita, dataPrenotazione);
        lista.add(p);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lista;
  }

  private static boolean checkUser(ArrayList<Utente> utenti, String nomeUtente) {
    for (Utente user : utenti) {
      if (user.getNome().equals(nomeUtente))
        return true;
    }
    return false;
  }

  private static boolean checkAttivita(ArrayList<Attivita> attivita, String nomeAttivita) {
    for (Attivita a : attivita) {
      if (a.getNome().equals(nomeAttivita))
        return true;
    }
    return false;
  }

  public static boolean validate(ArrayList<Utente> utenti, ArrayList<Attivita> attivita,
      ArrayList<Prenotazione> prenotazioni) {

    ArrayList<Prenotazione> schemaCorretto = new ArrayList<Prenotazione>();

    for (Prenotazione prenotazione : prenotazioni)
      schemaCorretto.add(prenotazione);

    for (Prenotazione prenotazione : prenotazioni) {
      if (checkUser(utenti, prenotazione.nomeUtente) && checkAttivita(attivita, prenotazione.nomeAttivita))
        schemaCorretto.add(prenotazione);

    }
    return false;
  }
}

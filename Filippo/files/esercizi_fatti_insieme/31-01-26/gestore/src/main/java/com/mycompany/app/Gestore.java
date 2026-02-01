package com.mycompany.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class Gestore {

  private String utentiPath;
  private String attivitaPath;
  private String prenotazioniPath;

  private ArrayList<Utente> utenti;
  private ArrayList<Attivita> attivita;
  private ArrayList<Prenotazione> prenotazioni;

  public Gestore(String utentiPath, String attivitaPath, String prenotazioniPath, Boolean convalida) {
    this.utentiPath = utentiPath;
    this.attivitaPath = attivitaPath;
    this.prenotazioniPath = prenotazioniPath;

    this.utenti = loadUtenti(utentiPath);
    this.attivita = loadAttivita(attivitaPath);
    ArrayList<UnlinkedPrenotazione> unlinkedPrenotazioni = loadPrenotazioni(prenotazioniPath);
    this.prenotazioni = linkPrenotazione(unlinkedPrenotazioni, this.utenti, this.attivita);
  }

  private static ArrayList<Utente> loadUtenti(String filePath) {
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

  private static ArrayList<Attivita> loadAttivita(String filePath) {
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

  private static ArrayList<UnlinkedPrenotazione> loadPrenotazioni(String filePath) {
    ArrayList<UnlinkedPrenotazione> lista = new ArrayList<>();
    try {
      List<String> lines = Files.readAllLines(Paths.get(filePath));
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      for (String line : lines) {
        String[] parti = line.split(",");
        for (int i = 0; i < parti.length; i++)
          parti[i] = parti[i].strip();

        String email = parti[0];
        String nomeAttivita = parti[1];
        LocalDate dataPrenotazione = LocalDate.parse(parti[2], formatter);

        UnlinkedPrenotazione p = new UnlinkedPrenotazione(email, nomeAttivita, dataPrenotazione);
        lista.add(p);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lista;
  }

  static ArrayList<Prenotazione> linkPrenotazione(ArrayList<UnlinkedPrenotazione> unlinkedPrenotazioni,
      ArrayList<Utente> utenti,
      ArrayList<Attivita> activities) {

    ArrayList<Prenotazione> prenotazioniLinkate = new ArrayList<>();
    // cerco utente e attività relativa a email e nomeAttivita
    for (UnlinkedPrenotazione up : unlinkedPrenotazioni) {
      Utente utente = null;
      for (Utente u : utenti) {
        if (u.getEmail().equals(up.getEmail())) {
          utente = u;
          break;
        }
      }

      Attivita attivita = null;
      for (Attivita a : activities) {
        if (a.getNome().equals(up.getNomeAttivita())) {
          attivita = a;
          break;
        }
      }

      if (utente != null && attivita != null) {
        Prenotazione p = new Prenotazione(utente, attivita, up.getDataPrenotazione());
        prenotazioniLinkate.add(p);
      } else {
        System.out.println("Prenotazione non valida: " + up);
      }
    }

    return prenotazioniLinkate;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Utenti:\n");
    for (Utente u : utenti) {
      sb.append(u).append("\n");
    }
    sb.append("\nAttivita:\n");
    for (Attivita a : attivita) {
      sb.append(a).append("\n");
    }
    sb.append("\nPrenotazioni:\n");
    for (Prenotazione p : prenotazioni) {
      sb.append(p).append("\n");
    }
    return sb.toString();
  }
}

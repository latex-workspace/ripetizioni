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
    this.prenotazioni = loadPrenotazioni(prenotazioniPath);
    if (convalida)
      this.convalida();
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

  private static ArrayList<Prenotazione> loadPrenotazioni(String filePath) {
    ArrayList<Prenotazione> lista = new ArrayList<>();
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
        Prenotazione p = new Prenotazione(email, nomeAttivita, dataPrenotazione);
        lista.add(p);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lista;
  }

  private static boolean checkUser(ArrayList<Utente> utenti, String email) {
    for (Utente user : utenti) {
      if (user.getEmail().equals(email))
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

  public boolean convalida() {

    ArrayList<Prenotazione> schemaCorretto = new ArrayList<Prenotazione>();

    // for (Prenotazione prenotazione : prenotazioni)
    // schemaCorretto.add(prenotazione);

    boolean valido = true;
    for (Prenotazione prenotazione : this.prenotazioni) {
      if (checkUser(this.utenti, prenotazione.getEmail())
          && checkAttivita(this.attivita, prenotazione.getNomeAttivita()))
        schemaCorretto.add(prenotazione);
      else {
        valido = false;
        System.out.println("Prenotazione non valida: " + prenotazione.toString());
      }

    }

    this.prenotazioni = schemaCorretto;
    return valido;
  }

  public void stampaAttivitaDisponibili() {
    for (Attivita a : this.attivita) {
      System.out.println("Attività \"" + a.getNome() + "\" dal " + a.getStartTime() + " al " + a.getEndTime());
      int numeroPrenotazioni = 0;
      // Conta le prenotazioni per questa attività
      for (Prenotazione p : this.prenotazioni) {
        if (p.getNomeAttivita().equals(a.getNome()))
          numeroPrenotazioni++;
      }
      System.out.println("\tPrenotazioni:\t" + numeroPrenotazioni);
      System.out.println("\tPosti rimanente:\t" + (a.getCapacitaMassima() - numeroPrenotazioni));
    }
  }

  public void stampaPrenotazioni() {
    for (Attivita a : this.attivita) {
      ArrayList<Prenotazione> prenotazioniAttivita = new ArrayList<>();
      for (Prenotazione p : this.prenotazioni) {
        if (p.getNomeAttivita().equals(a.getNome()))
          prenotazioniAttivita.add(p);
      }
      if (prenotazioni.size() > 0) {
        prenotazioni.sort((p1, p2) -> p1.getDataPrenotazione().compareTo(p2.getDataPrenotazione()));
        System.out.println("Prenotazioni per l'attività \"" + a.getNome() + "\":");
        for (Prenotazione p : prenotazioniAttivita)
          System.out.println("\t" + p.toString());
      }
    }
  }

  public ArrayList<Prenotazione> getPrenotazioniByEmail(String email) {
    ArrayList<Prenotazione> prenotazioni = new ArrayList<>();
    for (Prenotazione p : this.prenotazioni) {
      if (p.getEmail().equals(email))
        prenotazioni.add(p);
    }
    return prenotazioni;
  }

  public boolean aggiungiPrenotazione(Prenotazione p) {
    if (!checkUser(utenti, p.getEmail()))
      return false;

    if (!checkAttivita(attivita, p.getNomeAttivita()))
      return false;

    if (p.getDataPrenotazione().isBefore(LocalDate.now()))
      return false;

    ArrayList<Prenotazione> prenotazioniUtente = getPrenotazioniByEmail(p.getEmail());
    for (Prenotazione prenotazione : prenotazioniUtente) {
      if (prenotazione.getNomeAttivita().equals(p.getNomeAttivita())
          && prenotazione.getDataPrenotazione().equals(p.getDataPrenotazione())) {
        return false;
      }
    }

    // Controllo non sia pieno
    int numeroPrenotazioni = 0;
    for (Prenotazione p1 : this.prenotazioni) {
      if (p1.getNomeAttivita().equals(p.getNomeAttivita()))
        numeroPrenotazioni++;
    }

    // Controllo capacità massima
    int numeroMassimoPrenotazioni = numeroPrenotazioni;
    for (Attivita a : this.attivita)
      if (a.getNome().equals(p.getNomeAttivita()))
        numeroMassimoPrenotazioni = a.getCapacitaMassima();

    if (numeroPrenotazioni == numeroMassimoPrenotazioni)
      return false;

    // Aggiungo la prenotazione in memoria
    prenotazioni.add(p);

    // Aggiungo la prenotazione in memoria
    try {
      Files.writeString(Paths.get(this.prenotazioniPath), p.toString(), StandardOpenOption.APPEND);
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("Stampato su file");
    return true;
  }

  public ArrayList<Utente> getUtenti() {
    return utenti;
  }

  public void setUtenti(ArrayList<Utente> utenti) {
    this.utenti = utenti;
  }

  public ArrayList<Attivita> getAttivita() {
    return attivita;
  }

  public void setAttivita(ArrayList<Attivita> attivita) {
    this.attivita = attivita;
  }

  public ArrayList<Prenotazione> getPrenotazioni() {
    return prenotazioni;
  }

  public void setPrenotazioni(ArrayList<Prenotazione> prenotazioni) {
    this.prenotazioni = prenotazioni;
  }

}

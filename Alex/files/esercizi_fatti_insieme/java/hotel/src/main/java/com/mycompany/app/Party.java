package com.mycompany.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
/**
 * Party
 */
import java.util.ArrayList;

public class Party {
  public static final int MAX_INVITATI = 50;
  private ArrayList<Persona> invitati = new ArrayList<Persona>();
  private Persona organizzatione;
  private Residenza indirizzo;

  public Party(Persona organizzatione, Residenza indirizzo) {
    this.organizzatione = organizzatione;
    this.indirizzo = indirizzo;
  }

  public void startFileSync(String pathStr) throws IOException {
    // System.out.println(System.getProperty("user.dir"));
    Path path = Path.of(pathStr);

    // c://qualcosa\qualcosa
    // /qualcosa/qualcosa
    for (String line : Files.readAllLines(path)) {
      System.out.println(line);
    }

  }

  public void stopFileSync() {
  }

  public void loadFromFile(String path) {
  }

  public void dumpIntoFile(String path) {
  }

  public void aggiungiInvitato(Persona invitato) {
    if (invitati.size() >= MAX_INVITATI)
      throw new IllegalStateException("Numero massimo di invitati raggiunto");
    invitati.add(invitato);
  }

  public int getNumeroInvitati() {
    return invitati.size();
  }

  public Persona getOrganizzatione() {
    return organizzatione;
  }

  public void setOrganizzatione(Persona organizzatione) {
    this.organizzatione = organizzatione;
  }

  public Residenza getIndirizzo() {
    return indirizzo;
  }

  public void setIndirizzo(Residenza indirizzo) {
    this.indirizzo = indirizzo;
  }

}

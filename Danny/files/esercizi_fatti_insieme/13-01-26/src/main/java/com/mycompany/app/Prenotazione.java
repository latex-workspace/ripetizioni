package com.mycompany.app;

import java.time.LocalDate;
import java.util.Date;

/**
 * Prenotazione
 */
public class Prenotazione {

  String nomeUtente;
  String nomeAttivita;
  LocalDate dataPrenotazione;

  public Prenotazione(String nomeUtente, String nomeAttivita, LocalDate dataPrenotazione) {
    this.nomeUtente = nomeUtente;
    this.nomeAttivita = nomeAttivita;
    this.dataPrenotazione = dataPrenotazione;
  }

  public String getNomeUtente() {
    return nomeUtente;
  }

  public void setNomeUtente(String nomeUtente) {
    this.nomeUtente = nomeUtente;
  }

  public String getNomeAttivita() {
    return nomeAttivita;
  }

  public void setNomeAttivita(String nomeAttivita) {
    this.nomeAttivita = nomeAttivita;
  }

  public LocalDate getDataPrenotazione() {
    return dataPrenotazione;
  }

  public void setDataPrenotazione(LocalDate dataPrenotazione) {
    this.dataPrenotazione = dataPrenotazione;
  }

  @Override
  public String toString() {
    return nomeUtente + "," + nomeAttivita + "," + dataPrenotazione;
  }

}

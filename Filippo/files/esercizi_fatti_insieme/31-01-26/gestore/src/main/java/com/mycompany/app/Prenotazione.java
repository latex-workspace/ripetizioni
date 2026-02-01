package com.mycompany.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Prenotazione
 */
public class Prenotazione {

  private Utente utente;
  private Attivita attivita;
  private LocalDate dataPrenotazione;

  public Prenotazione(Utente utente, Attivita attivita, LocalDate dataPrenotazione) {
    this.utente = utente;
    this.attivita = attivita;
    this.dataPrenotazione = dataPrenotazione;
  }

  public Utente getUtente() {
    return utente;
  }

  public void setUtente(Utente utente) {
    this.utente = utente;
  }

  public Attivita getAttivita() {
    return attivita;
  }

  public void setAttivita(Attivita attivita) {
    this.attivita = attivita;
  }

  public LocalDate getDataPrenotazione() {
    return dataPrenotazione;
  }

  public void setDataPrenotazione(LocalDate dataPrenotazione) {
    this.dataPrenotazione = dataPrenotazione;
  }

  @Override
  public String toString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return utente + "," + attivita + "," + dataPrenotazione.format(formatter);
  }

}

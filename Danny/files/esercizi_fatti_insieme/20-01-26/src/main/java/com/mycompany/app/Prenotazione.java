package com.mycompany.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Prenotazione
 */
public class Prenotazione {

  private String email;
  private String nomeAttivita;
  private LocalDate dataPrenotazione;

  public Prenotazione(String email, String nomeAttivita, LocalDate dataPrenotazione) {
    this.email = email;
    this.nomeAttivita = nomeAttivita;
    this.dataPrenotazione = dataPrenotazione;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    return email + "," + nomeAttivita + "," + dataPrenotazione.format(formatter);
  }

}

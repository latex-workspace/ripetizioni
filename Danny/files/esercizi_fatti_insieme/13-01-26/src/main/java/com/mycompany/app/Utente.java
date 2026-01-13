package com.mycompany.app;

import java.time.LocalDate;

/**
 * Utente
 */
public class Utente {
  private String nome;
  private String cognome;
  private LocalDate dataNascita;
  private long telefono;
  private String email;

  public Utente(String nome, String cognome, LocalDate dataNascita, long telefono, String email) {
    this.nome = nome;
    this.cognome = cognome;
    this.dataNascita = dataNascita;
    this.telefono = telefono;
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCognome() {
    return cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public LocalDate getDataNascita() {
    return dataNascita;
  }

  public void setDataNascita(LocalDate dataNascita) {
    this.dataNascita = dataNascita;
  }

  public long getTelefono() {
    return telefono;
  }

  public void setTelefono(long telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return nome + "," + cognome + ","
        + dataNascita + ","
        + telefono + "," + email;
  }

}

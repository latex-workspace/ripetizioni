package com.mycompany.app;

import java.util.Calendar;

/**
 * Person
 */
public class Persona {
  private String nome;
  private String cognome;
  private Calendar dataNascita;
  private Residenza residenza;
  private NumeroCellulare numeroCellulare;
  private Email email;

  public Persona(String nome, String cognome, Calendar dataNascita, Residenza residenza,
      NumeroCellulare numeroCellulare, Email email) {

    Calendar now = Calendar.getInstance();
    if (dataNascita.after(now))
      throw new IllegalArgumentException("La data di nascita non può essere nel futuro");

    this.nome = nome;
    this.cognome = cognome;
    this.dataNascita = dataNascita;
    this.residenza = residenza;
    this.numeroCellulare = numeroCellulare;
    this.email = email;
  }

  @Override
  public String toString() {
    return this.nome + " " + this.cognome + ": " +
        "\nData di nascita:\t" + this.dataNascita.getTime().toString() +
        "\nResidenza:      \t" + this.residenza.toString() +
        "\nCellulare:      \t" + this.numeroCellulare.toString() +
        "\nEmail:          \t" + this.email;
  }
}

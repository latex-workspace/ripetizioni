package com.mycompany.app;

class Residenza {
  private String citta;
  private String via;
  private int numeroCivico;

  public Residenza(String citta, String via, int numeroCivico) {
    this.citta = citta;
    this.via = via;
    this.numeroCivico = numeroCivico;
  }

  @Override
  public String toString() {
    return this.via + " " + this.numeroCivico + ", " + this.citta;
  }

  public String getCitta() {
    return citta;
  }

  public void setCitta(String citta) {
    this.citta = citta;
  }

  public String getVia() {
    return via;
  }

  public void setVia(String via) {
    this.via = via;
  }

  public int getNumeroCivico() {
    return numeroCivico;
  }

  public void setNumeroCivico(int numeroCivico) {
    this.numeroCivico = numeroCivico;
  }

}

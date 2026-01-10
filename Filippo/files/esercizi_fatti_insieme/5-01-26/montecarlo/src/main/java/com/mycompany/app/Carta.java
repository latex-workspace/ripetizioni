package com.mycompany.app;

enum Seme {
  CUORI, FIORI, QUADRI, PICCHE
}

enum Numero {
  A("Asso"), N2("2"), N3("3"), N4("4"), N5("5"), N6("6"), N7("7"), N8("8"),
  N9("9"), N10("10"), J("Jack"), Q("Regina"), K("Re");

  private final String nome;

  Numero(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return this.nome;
  }

}

public class Carta {
  private Seme seme;
  private Numero numero;

  public Carta(Seme s, Numero n) {
    this.seme = s;
    this.numero = n;
  }

  public Seme getSeme() {
    return seme;
  }

  public void setSeme(Seme seme) {
    this.seme = seme;
  }

  public Numero getNumero() {
    return numero;
  }

  public void setNumero(Numero numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    return this.numero + " di " + this.seme;
  }

}

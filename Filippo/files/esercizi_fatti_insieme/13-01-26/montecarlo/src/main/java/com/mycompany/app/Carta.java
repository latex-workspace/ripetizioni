package com.mycompany.app;

enum Seme {
  CUORI, FIORI, QUADRI, PICCHE
}

enum Numero {
  A("Asso", 1), N2("2", 2), N3("3", 3), N4("4", 4), N5("5", 5), N6("6", 6), N7("7", 7), N8("8", 8),
  N9("9", 9), N10("10", 10), J("Jack", 11), Q("Regina", 12), K("Re", 13);

  private final String nome;
  private final int valore;

  Numero(String nome, int valore) {
    this.nome = nome;
    this.valore = valore;
  }

  @Override
  public String toString() {
    return this.nome;
  }

  public String getNome() {
    return nome;
  }

  public int getValore() {
    return valore;
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

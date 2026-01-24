package com.mycompany.app;

public class NumeroCellulare {
  private int prefisso;
  private int numero;

  public NumeroCellulare(int prefisso, int numero) {
    checkPrefix(prefisso);
    checkNumber(numero);

    this.prefisso = prefisso;
    this.numero = numero;
  }

  private void checkNumber(int numero) {
    if (numero < 0)
      throw new IllegalArgumentException("Il numero non può essere negativo");
    if (((Integer) numero).toString().length() != 10)
      throw new IllegalArgumentException("Il numero deve avere esattamente 10 cifre");
    // Converto in stringa e controllo lunghezza
    // Confronto numerico
    // if (numero < 1000000000 || numero > 9999999999L) {
    // throw new IllegalArgumentException("Il numero deve avere esattamente 10
    // cifre");
    // }
  }

  private void checkPrefix(int prefix) {
    if (prefix < 0)
      throw new IllegalArgumentException("Il prefisso non può essere negativo");
  }

  @Override
  public String toString() {
    // Converti numero in stringa
    // Prendi sottostringa da [0, 3)
    // Prendi sottostringa da [3, 6)
    // Prendi sottostringa da [6, 10)
    String numeroStr = ((Integer) this.numero).toString();

    return "+" + this.prefisso + "\t" + numeroStr.substring(0, 3) + " " + numeroStr.substring(3, 6) + " "
        + numeroStr.substring(6, 10);
  }

  public int getPrefisso() {
    return prefisso;
  }

  public void setPrefisso(int prefisso) {
    checkPrefix(prefisso);
    this.prefisso = prefisso;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    checkNumber(numero);
    this.numero = numero;
  }

}

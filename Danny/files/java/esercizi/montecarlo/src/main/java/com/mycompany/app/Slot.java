package com.mycompany.app;

import java.util.Random;

enum Vincita {
  POKER_FIGURE, POKER_ASSI, COLORE, SCALA_COLORE;

  public int getValore(Mazzo m) {
    switch (this) {
      case POKER_FIGURE:
        return 1000;
      case POKER_ASSI:
        return 2000;
      case COLORE:
        return 200;
      case SCALA_COLORE:
        return 3000;
      default:
        return 0;
    }
  }
}

public class Slot {
  private String nome;
  private TipoMazzo tipoMazzo;
  private Mazzo mazzo;

  public Slot(String nome, TipoMazzo tipoMazzo) {
    this.nome = nome;
    this.tipoMazzo = tipoMazzo;
    mazzo = new Mazzo(tipoMazzo);
  }

  public Slot(String nome, TipoMazzo tipoMazzo, Mazzo mazzo) {
    this.nome = nome;
    this.tipoMazzo = tipoMazzo;
    this.mazzo = mazzo;
  }

  public Mazzo estraiCarte(int numero) {
    Mazzo estratte = new Mazzo(TipoMazzo.VUOTO);
    // Per "numero" volte
    Random rand = new Random();

    // if (numero > this.mazzo.getNumeroCarte()) {
    // throw new IllegalArgumentException("Non ci sono abbastanza carte nel mazzo
    // per l'estrazione");
    // }

    System.out.println("Estraggo da mazzo con : " + this.mazzo.getNumeroCarte());

    if (numero > this.mazzo.getNumeroCarte()) {
      System.out.println(
          "Stai provando ad estrarre " + numero + " carte, ma il mazzo ne contiene " + this.mazzo.getNumeroCarte()
              + ". Verranno estratte tutte le carte rimanenti.");
      for (Carta c : this.mazzo.getCarte())
        estratte.aggiungiCarta(c);
      return estratte;
    }

    for (int i = 0; i < numero; i++) {
      // 1. estrai indice random
      int random_index = rand.nextInt(0, this.mazzo.getNumeroCarte());

      // 2. rimuovi carta a indice "random_index"
      Carta carta_estratta = this.mazzo.rimuoviCarta(random_index);

      // 3. aggiungi carta a "estratte"
      estratte.aggiungiCarta(carta_estratta);
    }

    return estratte;
  }

  public Vincita getVincita() {
  }

}

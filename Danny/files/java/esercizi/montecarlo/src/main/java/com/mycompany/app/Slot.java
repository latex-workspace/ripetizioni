package com.mycompany.app;

import java.util.ArrayList;
import java.util.Random;

enum TipoVincita {
  POKER_FIGURE, POKER_ASSI, COLORE, SCALA_COLORE, NONE;
}

class Vincita {
  int valore;
  TipoVincita tipo;

  public Vincita(Mazzo m) {

    if (m.getNumeroCarte() < 4) {
      this.valore = 0;
      this.tipo = TipoVincita.NONE;
      return;
    }

    // Colore e scala colore
    ArrayList<Mazzo> semi = new ArrayList<Mazzo>(4);

    for (int i = 0; i < m.getNumeroCarte(); i++)
      semi.get(m.getCarta(i).getSeme().ordinal()).aggiungiCarta(m.getCarta(i));

    // Scala colore
    for (Mazzo s : semi) {
      s.sort();
      if (s.getNumeroCarte() != 0) {
        int currValore = s.getCarta(0).getValore();
        int count = 1;
        for (int i = 1; i < s.getNumeroCarte(); i++) {
          if (s.getCarta(i).getValore() == currValore + 1) {
            currValore++;
            count++;
          } else
            break;

        }
        if (count >= 5) {
          int sum = 0;
          for (int j = 0; j < count; j++)
            sum += s.getCarta(j).getValore();

          this.tipo = TipoVincita.SCALA_COLORE;
          this.valore = sum * 10;
          return;
        }
      }
    }

    // Colore
    for (Mazzo s : semi) {
      if (s.getNumeroCarte() >= 5) {
        int sum = 0;
        for (Carta c : s.getCarte())
          sum += c.getValore();

        this.tipo = TipoVincita.COLORE;
        this.valore = sum * 8;
        return;
      }
    }

    Mazzo assi = new Mazzo(TipoMazzo.VUOTO);
    Mazzo figure = new Mazzo(TipoMazzo.VUOTO);
    for (Carta c : m.getCarte()) {
      if (c.getValore() == 1)
        assi.aggiungiCarta(c);
      if (c.getValore() >= 11) {
        figure.aggiungiCarta(c);
      }
    }

    if (assi.getNumeroCarte() == 4) {
      this.tipo = TipoVincita.POKER_ASSI;
      this.valore = 2000;
      return;
    } else if (figure.getNumeroCarte() == 4) {
      this.tipo = TipoVincita.POKER_FIGURE;
      this.valore = 1000;
      return;
    }

    this.tipo = TipoVincita.NONE;
    this.valore = 0;
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

  // public Vincita getVincita(Mazzo mazzo) {
  //
  // }

}

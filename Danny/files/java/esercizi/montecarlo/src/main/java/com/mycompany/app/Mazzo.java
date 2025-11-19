package com.mycompany.app;

import java.util.ArrayList;

enum TipoMazzo {
  STANDARD,
  VUOTO,
  STANDARD_JOLLY,
  NO_FIGURE;

  public String toString() {
    switch (this) {
      case STANDARD:
        return "Mazzo Standard da 52 carte";
      case VUOTO:
        return "Mazzo Vuoto";
      case STANDARD_JOLLY:
        return "Mazzo Standard con Jolly da 54 carte";
      case NO_FIGURE:
        return "Mazzo senza Figure da 40 carte";
      default:
        return "Tipo di mazzo sconosciuto";
    }
  }

}

public class Mazzo {
  private ArrayList<Carta> carte = new ArrayList<Carta>();

  public Mazzo(ArrayList<Carta> carte) {
    this.carte = carte;
  }

  public Mazzo(TipoMazzo tipo) {
    if (tipo == TipoMazzo.VUOTO) {
      this.carte = new ArrayList<Carta>();
    } else if (tipo == TipoMazzo.STANDARD) {
      for (Seme seme : Seme.values()) {
        for (int valore = 1; valore <= 13; valore++)
          carte.add(new Carta(seme, valore));
      }
    } else if (tipo == TipoMazzo.STANDARD_JOLLY) {

      for (Seme seme : Seme.values()) {
        for (int valore = 1; valore <= 13; valore++)
          carte.add(new Carta(seme, valore));
      }

      carte.add(Carta.creaJolly());
      carte.add(Carta.creaJolly());
    } else if (tipo == TipoMazzo.NO_FIGURE) {
      for (Seme seme : Seme.values()) {
        for (int valore = 1; valore <= 10; valore++)
          carte.add(new Carta(seme, valore));
      }
    } else {
      throw new IllegalArgumentException("Tipo di mazzo non ancora implementato");
    }
  }

  public int getNumeroCarte() {
    return carte.size();
  }

  public Carta rimuoviCarta(int index) {
    return carte.remove(index);
  }

  public void aggiungiCarta(Carta carta) {
    carte.add(carta);
  }

  public ArrayList<Carta> getCarte() {
    return carte;
  }

  @Override
  public String toString() {
    return carte + " ";
  }

  public void sort() {
    carte.sort((c1, c2) -> {
      return c1.compare(c2);
    });
  }

}

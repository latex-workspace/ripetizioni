package com.mycompany.app;

import java.util.ArrayList;

enum TipoMazzo {
  PIENO, VUOTO, PIENO_JOLLY
}

public class Mazzo {
  private ArrayList<Carta> carte = new ArrayList<Carta>();

  public Mazzo(TipoMazzo tipo) {
    if (tipo == TipoMazzo.PIENO) {
      Seme[] semi = Seme.values();
      Numero[] numeri = Numero.values();
      for (int i = 0; i < semi.length; i++) {
        for (int j = 0; j < numeri.length; j++) {
          Carta c = new Carta(semi[i], numeri[j]);
          carte.add(c);
        }
      }
    } else if (tipo == TipoMazzo.VUOTO) {
    } else {
      throw new IllegalArgumentException("Tipo di mazzo non supportato");
    }
  }

  public ArrayList<Carta> getCarte() {
    return carte;
  }

  public void setCarte(ArrayList<Carta> carte) {
    this.carte = carte;
  }

  @Override
  public String toString() {
    return "Mazzo con " + carte.size() + "carte: \n" + carte;
  }

}

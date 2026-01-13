package com.mycompany.app;

import java.util.Random;
import java.util.ArrayList;

/**
 * Slot
 */
public class Slot {
  Mazzo mazzo;

  public Slot() {
    this.mazzo = new Mazzo(TipoMazzo.PIENO);
  }

  public Slot(Mazzo mazzo) {
    this.mazzo = mazzo;
  }

  /// Pesca n carte a random
  public Mazzo pesca(int n) {

    Random random = new Random();

    if (n < 0 || n > mazzo.getCarte().size()) {
      /// incazzati
      throw new IllegalArgumentException("Numero di carte da pescare non valido");
    }

    // ArrayList<Carta> cartePescate = new ArrayList<Carta>();
    Mazzo cartePescate = new Mazzo(TipoMazzo.VUOTO);

    for (int i = 0; i < n; i++) {
      int indiceCartaEstratta = random.nextInt(0, mazzo.getCarte().size());
      Carta cartaEstratta = mazzo.getCarte().remove(indiceCartaEstratta);
      cartePescate.getCarte().add(cartaEstratta);
    }

    return cartePescate;
  }

}

package com.mycompany.app;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Mazzo m = new Mazzo(TipoMazzo.PIENO);
    System.out.println(m.getCarte());

    Slot slot1 = new Slot(m);
    Slot slot2 = new Slot();

    Mazzo m1 = slot1.pesca(5);
    Mazzo m2 = slot1.pesca(1);
    Mazzo m3 = slot1.pesca(17);

    m3.getCarte().sort((c1, c2) -> {
      int semeCompare = c1.getSeme().compareTo(c2.getSeme());
      if (semeCompare != 0) {
        return semeCompare;
      } else {
        return c1.getNumero().compareTo(c2.getNumero());
      }
    });

    System.out.println("Pescato 5 carte: " + m1);
    System.out.println("Pescato 1 carte: " + m2);
    System.out.println("Pescato 17 carte: " + m3);

    ArrayList<Numero> numeri = new ArrayList<Numero>();
    numeri.add(Numero.A);
    numeri.add(Numero.N2);
    numeri.add(Numero.N4);
    numeri.add(Numero.N5);
    numeri.add(Numero.N6);
    numeri.add(Numero.N7);
    numeri.add(Numero.N9);
    numeri.add(Numero.N10);

    // System.out.println(Vincinte.sottosequenzaMassimaContigua(numeri));
    System.out.println(Vincinte.sottosequenzaMassimaContigua2(numeri));
    // System.out.println("Finito di pescare");
    // System.out.println("Pescato 5 carte: " + slot1.pesca(5));

    // slot2.pesca(-3);
    // System.out.println("Pescato -3 carte");

    // System.out.println(slot1.mazzo.getCarte());
  }
}

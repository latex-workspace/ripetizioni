package com.mycompany.app;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    Mazzo m = new Mazzo(TipoMazzo.PIENO);
    System.out.println(m.getCarte());

    Slot slot1 = new Slot(m);
    Slot slot2 = new Slot();

    System.out.println("Pescato 5 carte: " + slot1.pesca(5));
    System.out.println("Pescato 1 carte: " + slot1.pesca(1));
    System.out.println("Pescato 17 carte: " + slot1.pesca(17));

    // System.out.println("Finito di pescare");
    // System.out.println("Pescato 5 carte: " + slot1.pesca(5));

    // slot2.pesca(-3);
    // System.out.println("Pescato -3 carte");

    // System.out.println(slot1.mazzo.getCarte());
  }
}

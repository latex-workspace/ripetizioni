package com.mycompany.app;

import java.util.ArrayList;

public class Main {

  public static void testCards() {
    Carta carta1 = new Carta(Seme.CUORI, 5);
    Carta carta2 = new Carta(Seme.PICCHE, 2);

    Carta jolly = Carta.creaJolly();

    System.out.println(carta1);
    System.out.println(carta2);
    System.out.println(jolly);
  }

  public static void testDecks() {
    Mazzo mazzoVuoto = new Mazzo(TipoMazzo.VUOTO);
    Mazzo mazzoStandard = new Mazzo(TipoMazzo.STANDARD);
    Mazzo mazzoNoFigure = new Mazzo(TipoMazzo.NO_FIGURE);
    Mazzo mazzoStandardJolly = new Mazzo(TipoMazzo.STANDARD_JOLLY);

    mazzoVuoto.sort();
    mazzoStandard.sort();
    mazzoNoFigure.sort();
    mazzoStandardJolly.sort();

    System.out.println(mazzoStandard);
    System.out.println(mazzoNoFigure);
    System.out.println(mazzoStandardJolly);
  }

  public static void testSlot() {
    Slot slot1 = new Slot("Slot 1", TipoMazzo.STANDARD);
    Slot slot2 = new Slot("Slot 2", TipoMazzo.NO_FIGURE);

    Mazzo estrazione5 = slot1.estraiCarte(50);
    System.out.println("Ho estratto 50 carte: \n" + estrazione5);
    System.out.println("Ne estraggo altre 5");
    Mazzo estrazione6 = slot1.estraiCarte(5);
    System.out.println(estrazione6);

    // Mazzo estrazione2 = slot2.estraiCarte(5);
    // System.out.println(estrazione2);
  }

  public static void main(String[] args) {

    // testCards();

    testDecks();

    // testSlot();
  }
}

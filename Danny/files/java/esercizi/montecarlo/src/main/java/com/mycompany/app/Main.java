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

  public static void testVincita() {
    Mazzo pokerAssi = new Mazzo(TipoMazzo.VUOTO);
    pokerAssi.aggiungiCarta(new Carta(Seme.CUORI, 1));
    pokerAssi.aggiungiCarta(new Carta(Seme.FIORI, 1));
    pokerAssi.aggiungiCarta(new Carta(Seme.QUADRI, 1));
    pokerAssi.aggiungiCarta(new Carta(Seme.PICCHE, 1));
    pokerAssi.aggiungiCarta(new Carta(Seme.QUADRI, 10));

    Mazzo pokerFigure = new Mazzo(TipoMazzo.VUOTO);
    pokerFigure.aggiungiCarta(new Carta(Seme.CUORI, 12));
    pokerFigure.aggiungiCarta(new Carta(Seme.FIORI, 12));
    pokerFigure.aggiungiCarta(new Carta(Seme.QUADRI, 12));
    pokerFigure.aggiungiCarta(new Carta(Seme.PICCHE, 12));
    pokerFigure.aggiungiCarta(new Carta(Seme.QUADRI, 7));

    Mazzo colore = new Mazzo(TipoMazzo.VUOTO);
    colore.aggiungiCarta(new Carta(Seme.CUORI, 1));
    colore.aggiungiCarta(new Carta(Seme.CUORI, 2));
    colore.aggiungiCarta(new Carta(Seme.CUORI, 4));
    colore.aggiungiCarta(new Carta(Seme.CUORI, 6));
    colore.aggiungiCarta(new Carta(Seme.CUORI, 7));

    Mazzo scalaColore = new Mazzo(TipoMazzo.VUOTO);
    scalaColore.aggiungiCarta(new Carta(Seme.CUORI, 3));
    scalaColore.aggiungiCarta(new Carta(Seme.CUORI, 4));
    scalaColore.aggiungiCarta(new Carta(Seme.CUORI, 5));
    scalaColore.aggiungiCarta(new Carta(Seme.CUORI, 6));
    scalaColore.aggiungiCarta(new Carta(Seme.CUORI, 7));

    System.out.println(new Vincita(pokerAssi));
    System.out.println(new Vincita(pokerFigure));
    System.out.println(new Vincita(colore));
    System.out.println(new Vincita(scalaColore));
  }

  public static void testCasino() {
    Casino casino = new Casino("montecarlo");

    int slotId1 = casino.addSlot(new Slot("Slot 1", TipoMazzo.STANDARD));
    int slotId2 = casino.addSlot(new Slot("Slot 2", TipoMazzo.NO_FIGURE));
    int slotId3 = casino.addSlot(new Slot("Slot 3", TipoMazzo.STANDARD_JOLLY));

    System.out.println(casino);

    Slot retrievedSlot1 = casino.getSlotById(slotId1);
    System.out.println("Recuperato lo slot con ID " + slotId1 + ": " + retrievedSlot1);

    Slot retrievedSlot2 = casino.getSlotByName("Slot 2");
    System.out.println("Recuperato lo slot con nome \"Slot 2\": " + retrievedSlot2);

    System.out.println("\nGioco 4 round su slot " + slotId1);
    retrievedSlot1.play(100);
    retrievedSlot1.play(100);
    retrievedSlot1.play(100);
    retrievedSlot1.play(100);

    System.out.println("\nGioco 4 round su slot " + slotId2);
    retrievedSlot2.play(100);
    retrievedSlot2.play(100);
    retrievedSlot2.play(100);
    retrievedSlot2.play(100);

    Slot removedSlot2 = casino.removeSlotByName("Slot 2");
    System.out.println("Rimosso lo slot con nome 'Slot 2': " + removedSlot2);

    System.out.println(casino);
  }

  public static void main(String[] args) {

    // testCards();

    // testDecks();

    // testSlot();

    // testVincita();

    testCasino();
  }
}

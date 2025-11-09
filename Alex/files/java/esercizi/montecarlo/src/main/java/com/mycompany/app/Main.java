package com.mycompany.app;

import com.mycompany.app.Deck;

public class Main {
  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.fill();

    Slot slot = new Slot(deck);
    Deck drawn = slot.draw(25);

    System.out.println(deck);
    System.out.println(drawn);

    // System.out.println("My deck:\n" + deck);
    //
    // Card c1 = new Card(Seed.FIORI, 7);
    //
    // System.out.println(deck.checkCard(c1));
    //
    // System.out.println(deck.remove(c1));
    //
    // System.out.println(deck.checkCard(c1));
    //
    // System.out.println("Carte estratte:\n" + drawn);
    //
    // System.out.println("Mazzo:\n" + deck);

  }
}

package com.mycompany.app;

import java.util.Random;

public class Slot {

  Deck deck;

  public Slot(Deck deck) {
    this.deck = deck;
  }

  public Deck draw(int n) {
    Deck drawnCards = new Deck();
    Random r = new Random();

    if (n > deck.size()) {
      throw new IllegalArgumentException("Cannot draw more cards than available in the deck");
      // System.out.println("Ocio che non posso estrarne così tante");
    }
    for (int i = 0; i < Math.min(n, deck.size()); i++) {
      int randomIndex = r.nextInt(0, deck.size());
      drawnCards.cards.add(deck.getCard(randomIndex));
      deck.remove(randomIndex);
    }

    return drawnCards;
  }

  public static int checkColor(Deck deck) {
    if (deck.size() != 5)
      throw new IllegalArgumentException("Every deck should have 5 cards");

    Seed seed = deck.getCard(0).getSeed();
    int sum = 0;
    for (int i = 0; i < deck.size(); i++) {
      sum += deck.getCard(i).getNumber();
      if (deck.getCard(i).getSeed() != seed)
        return -1;
    }

    return sum * 8;
  }
}

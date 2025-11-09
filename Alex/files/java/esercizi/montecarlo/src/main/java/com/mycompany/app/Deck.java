package com.mycompany.app;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
  ArrayList<Card> cards = new ArrayList<Card>();

  public Deck() {
  }

  public void fill() {
    for (Seed seed : Seed.values()) {
      for (int i = 1; i <= 13; i++) {
        cards.add(new Card(seed, i));
      }
    }
  }

  public void clear() {
    this.cards.clear();
  }

  public ArrayList<Card> getCards() {
    return cards;
  }

  public void addCard(Card card) {
    this.cards.add(card);
  }

  public boolean checkCard(Card card) {
    return this.cards.contains(card);
  }

  public boolean remove(Card card) {
    return this.cards.remove(card);
  }

  public Card remove(int index) {
    return this.cards.remove(index);
  }

  public Card getCard(int index) {
    return this.cards.get(index);
  }

  public int size() {
    return this.cards.size();
  }

  @Override
  public String toString() {
    String rv = "";
    for (Card c : cards)
      rv += c.toString() + "\n";

    return rv;
  }

}

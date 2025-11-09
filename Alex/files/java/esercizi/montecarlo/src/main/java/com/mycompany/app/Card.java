package com.mycompany.app;

public class Card {
  private Seed seed;
  private int number;

  public Card(Seed seed, int number) {

    if (!(number >= 1 && number < 14)) {
      throw new IllegalArgumentException("Number must be between 1 and 13");
    }

    this.seed = seed;
    this.number = number;
  }

  public Seed getSeed() {
    return seed;
  }

  public void setSeed(Seed seed) {
    this.seed = seed;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Card other = (Card) obj;
    return number == other.number && seed == other.seed;
  }

  @Override
  public String toString() {
    return this.number + "\t" + this.seed;
  }

}

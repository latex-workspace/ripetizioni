package com.mycompany.app;

import java.util.ArrayList;

public class RationalNumber {
  private int numerator;
  private int denominator;

  public static RationalNumber sumAll(ArrayList<RationalNumber> rationals) {

    RationalNumber sum = new RationalNumber(0, 1);
    for (int i = 0; i < rationals.size(); i++)
      sum = sum.add(rationals.get(i));

    return sum;
  }

  public RationalNumber(int numerator, int denominator) {

    this.numerator = numerator;
    this.denominator = denominator;

    if (denominator == 0)
      throw new IllegalArgumentException("Denominator cannot be zero");

    if (denominator < 0) {
      this.numerator *= -1; // this.numerator = this.numerator * (-1);
      this.denominator *= -1;
    }

    this.simplify();
  }

  private void simplify() {
    for (int i = 2; i <= Math.min(this.numerator, this.denominator); i++) {
      while (this.numerator % i == 0 && this.denominator % i == 0) {
        this.numerator /= i;
        this.denominator /= i;
      }
    }
  }

  public RationalNumber reciprocal() {
    return new RationalNumber(this.denominator, this.numerator);
  }

  public RationalNumber mul(RationalNumber other) {
    return new RationalNumber(this.numerator * other.numerator, this.denominator * other.denominator);
  }

  public RationalNumber add(RationalNumber other) {
    return new RationalNumber(this.numerator * other.denominator + other.numerator * this.denominator,
        this.denominator * other.denominator);
  }

  public boolean equals(RationalNumber other) {
    return this.numerator == other.numerator && this.denominator == other.denominator;
  }

  public String toString() {
    return numerator + "/" + denominator;
  }

  public int getNumerator() {
    return numerator;
  }

  public void setNumerator(int numerator) {
    this.numerator = numerator;
    this.simplify();
  }

  public int getDenominator() {
    return denominator;
  }

  public void setDenominator(int denominator) {
    this.denominator = denominator;
    this.simplify();
  }

}

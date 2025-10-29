package com.mycompany.app;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    RationalNumber rn1 = new RationalNumber(1, 3);
    System.out.println(rn1);

    RationalNumber rn2 = new RationalNumber(6, 9);
    System.out.println(rn2);

    RationalNumber rn3 = rn1.reciprocal();
    System.out.println(rn3);

    RationalNumber rn4 = rn1.mul(rn2);
    System.out.println(rn4);

    ArrayList<RationalNumber> rationals = new ArrayList<RationalNumber>();
    rationals.add(rn1);
    rationals.add(rn2);
    rationals.add(rn3);
    rationals.add(rn4);

    rn4.setNumerator(rn4.getNumerator() * 2);
    rn4.setDenominator(rn4.getDenominator() * 2);

    System.out.print("Somma del vettore: [ ");
    for (RationalNumber rn : rationals) {
      System.out.print(rn + " ");
    }
    System.out.println("]");
    System.out.println(RationalNumber.sumAll(rationals));

    RationalNumber rn5 = new RationalNumber(1, 3);
    RationalNumber rn6 = new RationalNumber(2, 6);
    if (rn5.equals(rn6)) {
      System.out.println("Rational numbers are equal");
    } else {
      System.out.println("Rational numbers are not equal");
    }
  }
}

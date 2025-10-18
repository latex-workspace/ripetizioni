package com.mycompany.app;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    String s;
    int n;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Dammi una stringa: ");
    s = scanner.nextLine();

    System.out.println("Dammi un numero: ");
    n = scanner.nextInt();

    System.out.println("Stringa: " + s + "\nNumero: " + n);

    stampaRipetizioni(s, n);

    scanner.close();
  }

  // funzione stampaRipetizioni
  static void stampaRipetizioni(String s, int n) {
    for (int i = 0; i < n; i++) {
      System.out.println((i + 1) + ". " + s);
    }
  }

}

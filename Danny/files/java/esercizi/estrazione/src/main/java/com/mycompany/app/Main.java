package com.mycompany.app;

import java.util.Scanner;
import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Inserisci il numero di round da giocare: ");

    int rounds = scanner.nextInt();
    scanner.nextLine();

    if (rounds <= 0) {
      System.out.println("Il numero di round deve essere maggiore di 0. Uscita dal programma.");
      return;
    }

    Game game = new Game(rounds);
    game.play();
    scanner.close();
  }
}

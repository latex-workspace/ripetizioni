package com.mycompany.app;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int n;
    String s;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Dammi una stringa:");
    s = scanner.nextLine();

    System.out.println("Dammi un numero:");
    n = scanner.nextInt();

    if (n <= 0) {
      System.out.println("Il numero deve essere maggiore di zero.");
      scanner.close();
      return;
    }

    for (int i = 0; i < n; i++)
      System.out.println(i + 1 + ". " + s);

    scanner.close();
  }
}

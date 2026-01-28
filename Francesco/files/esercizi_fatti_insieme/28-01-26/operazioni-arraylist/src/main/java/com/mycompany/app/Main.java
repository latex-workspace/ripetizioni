package com.mycompany.app;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

enum Operation {
  CHECK_NUMBER("Verifica numero"),
  REMOVE_NUMBER("Rimuovi numero"),
  SORT("Sort"),
  CHECK_SORT("Check sort"),
  REVERSE("Reverse"),
  QUIT("Quit");

  private final String description;

  Operation(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

}

public class Main {
  public static void printPrompt() {
    for (Operation o : Operation.values()) {
      System.out.println((o.ordinal() + 1) + ") " + o.getDescription());
    }
  }

  public static int countOccurrences(ArrayList<Integer> v, int n) {

    int count = 0;
    for (int i = 0; i < v.size(); i++) {
      if (v.get(i) == n)
        count++;
    }

    return count;
  }

  public static int removeAll(ArrayList<Integer> v, int r) {

    int count = 0;
    ArrayList<Integer> rv = new ArrayList<>();
    for (int i = 0; i < v.size(); i++) {
      if (v.get(i) != r)
        rv.add(v.get(i));
      else
        count++;
    }

    // v.clear();
    // for (int i = 0; i < rv.size(); i++)
    // v.add(rv.get(i));

    for (int i = 0; i < rv.size(); i++)
      v.set(i, rv.get(i));
    v.subList(rv.size(), v.size()).clear();

    return count;
  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> v = new ArrayList<>();

    String line = "";
    while (true) {
      line = scanner.nextLine();
      if (line.equals("q"))
        break;

      try {
        v.add(Integer.parseInt(line));
      } catch (NumberFormatException e) {
        System.out.println("Input non valido, inserisci un numero o 'q' per uscire.");
      }
    }

    System.out.println("Hai inserito il vettore : " + v);

    while (true) {
      printPrompt();
      try {
        int operationNumber = scanner.nextInt();
        if (operationNumber < 1 || operationNumber > Operation.values().length) {
          throw new NumberFormatException("Il numero deve essere fra 1 e 6");
        }
        Operation operation = Operation.values()[operationNumber - 1];

        if (operation == Operation.CHECK_NUMBER) {
          System.out.println("Dammi un valore da ricercare: ");
          int n = scanner.nextInt();
          int occorrenze = countOccurrences(v, n);
          if (occorrenze > 0) {
            System.out.println("Il numero " + n + " è presente " + occorrenze + " volte nel vettore.");
          } else {
            System.out.println("Il numero " + n + " non è presente nel vettore.");
          }

        } else if (operation == Operation.REMOVE_NUMBER) {
          System.out.println("Dammi un valore da cancellare: ");
          int r = scanner.nextInt();
          int rimossi = removeAll(v, r);
          System.out.println("Ho rimosso " + rimossi + " elementi: " + v);
        } else if (operation == Operation.SORT) {
        } else if (operation == Operation.CHECK_SORT) {
        } else if (operation == Operation.REVERSE) {
        } else if (operation == Operation.QUIT) {
          break;
        }

      } catch (NumberFormatException e) {
        System.out.println("Operazione non valida: " + e.getMessage());
      } catch (InputMismatchException e) {
        System.out.println("Operazione non valida: " + e.getMessage());
        scanner.nextLine();
      }
    }

    scanner.close();
  }
}

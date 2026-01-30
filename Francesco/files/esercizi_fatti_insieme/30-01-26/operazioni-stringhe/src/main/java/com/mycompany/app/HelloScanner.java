package com.mycompany.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * HelloScanner
 */
public class HelloScanner {

  public static void run() {
    try (Scanner scanner = new Scanner(new File("files/input.txt"))) {
      // while (scanner.hasNextLine()) {
      // String line = scanner.nextLine();
      // // fai qualcosa con la linea letta
      // }

      while (scanner.hasNext()) {
        String word = scanner.next();
        // fai qualcosa con la parola letta
      }

      scanner.nextInt();
      scanner.hasNextInt();

      scanner.nextFloat();
      scanner.hasNextFloat();
    } catch (Exception e) {
      e.printStackTrace();
    }

    try (PrintWriter writer = new PrintWriter(new FileWriter("files/output.txt", false))) {
      writer.println("Riga aggiunta!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

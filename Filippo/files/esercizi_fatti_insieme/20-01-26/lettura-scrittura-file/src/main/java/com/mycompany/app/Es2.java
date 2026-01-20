package com.mycompany.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Es2
 */
public class Es2 {

  public static void run() throws FileNotFoundException {

    int v[] = new int[15];
    System.out.println(v[-1]); // Eccezione unchecked
    Scanner scanner = new Scanner(new File("input.txt")); // Eccezione checked

    // try {
    // throw new RuntimeException("RuntimeException");
    // } catch (RuntimeException e) {
    // System.out.println("Blocco RUNTIME");
    // } catch (Exception e) {
    // System.out.println("Blocco EXCEPTION");
    // } finally {
    // System.out.println("Blocco FINALLY");
    // }
  }

}

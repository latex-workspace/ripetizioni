package com.mycompany.app;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

/**
 * Es2
 */
public class Es2 {
  public static void es2() {

    try {
      // throw new RuntimeException(" - IllegalArgumentException in es2");
      // throw new IllegalArgumentException(" - IllegalArgumentException in es2");
      // throw new IOException(" - IOException in es2");
    } catch (IllegalArgumentException e) {
      System.out.println("Handling IllegalArgumentException" + e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Handling RuntimeException" + e.getMessage());
    } catch (Exception e) {
      System.out.println("Handling Exeption" + e.getMessage());
    }

  }

}

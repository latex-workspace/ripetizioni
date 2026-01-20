package com.mycompany.app;

/**
 * Hello world!
 */
public class Es1 {
  public static void run() {
    boolean throwRuntimeException = true;
    boolean throwIllegalArgException = true;
    try {
      System.out.println("Inizio blocco try");
      if (throwRuntimeException)
        throw new RuntimeException("RuntimeException");
      if (throwIllegalArgException)
        throw new IllegalArgumentException("IllegalArgumentException");

      System.out.println("Fine blocco try");
    } catch (IllegalArgumentException e) {
      System.out.println("Blocco ILLEGAL ARGUMENT");
      System.out.println(e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Blocco RUNTIME");
      System.out.println(e.getMessage());
    }
    System.out.println("Fine blocco try-catch");
    // non vengono eseguite
  }

}

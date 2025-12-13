package com.mycompany.app;

/**
 * Singleton
 */
public class Singleton {

  static Singleton instance = null;
  int x;

  private Singleton() {
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

}

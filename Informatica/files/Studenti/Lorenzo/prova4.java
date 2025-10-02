import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class prova4 {

  public static void main(String[] args) {

    Random r1 = new Random();
    Random r2 = new Random();

    System.out.println("--------------");
    System.out.println("r1 \t r2" );
    System.out.println("--------------");

    for (int i = 0; i < 10; i++) {
      System.out.println(r1.nextFloat() + "\t" + r2.nextDouble(0.0,15.5));
    }



  }

}

class A {

  protected int x = 15;

  public A(int x) {
    this.x = x;
  }

  public void stampa() {
    System.out.print(x + " ");
  }

}

/*
 * class B extends A {
 * 
 * public B(int x) {
 * super(x, "prova");
 * System.out.println("prova");
 * }
 * 
 * }
 */

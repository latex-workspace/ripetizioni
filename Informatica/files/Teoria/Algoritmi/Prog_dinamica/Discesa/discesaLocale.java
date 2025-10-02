
/*
https://training.olinfo.it/#/task/discesa/submissions
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class discesaLocale {

  static ArrayList<ArrayList<Integer>> v = new ArrayList<ArrayList<Integer>>();

  public static void main(String[] args) throws FileNotFoundException {

    Scanner s = new Scanner(new File("input.txt"));
    int size = s.nextInt();

    for (int i = 0; i < size; i++) {

      ArrayList<Integer> tmp = new ArrayList<Integer>();

      for (int j = 0; j <= i; j++) {
        tmp.add(s.nextInt());
      }

      v.add(tmp);

    }

    // vero programma
    //
    //
    stampaMatrice();
    System.out.println("----------------------");
    //System.out.println(v.get(0).get(0));

    for (int i = 1; i < size; i++) {

      v.get(i).set(0, v.get(i - 1).get(0) + v.get(i).get(0));

      v.get(i).set(i, v.get(i - 1).get(i - 1) + v.get(i).get(i));

      for (int j = 1; j < i; j++) {
        int maxParent = Math.max(v.get(i - 1).get(j - 1), v.get(i - 1).get(j));
        v.get(i).set(j, maxParent + v.get(i).get(j));
      }

      //stampaVett(v.get(i));

    }

    System.out.println("----------------------");
    System.out.println("Risposta: " + Collections.max(v.get(size - 1)));
    s.close();

  }

  public static void stampaVett(ArrayList<Integer> v) {
    for (int i = 0; i < v.size(); i++) {
      System.out.print(v.get(i) + " ");
    }
    System.out.println();
  }

  public static void stampaMatrice() {
    for (int i = 0; i < v.size(); i++) {
      for (int j = 0; j < v.get(i).size(); j++) {
        System.out.print(v.get(i).get(j) + " ");
      }
      System.out.println();
    }

  }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * cilinder
 */
public class cilinder {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner scan = new Scanner(new File("input.txt"));

    int size = scan.nextInt();// dimensione cilindro

    int prices[] = new int[size];// vettore dei prezzi

    for (int i = 0; i < size; i++) {
      prices[i] = scan.nextInt();
    }

    stampaVett(prices);

    System.out.println("\n\n");
    System.out.println(compute(prices));
    scan.close();

  }

  public static int compute(int prices[]) {

    int dp[] = new int[prices.length];

    dp[0] = prices[0];

    for (int i = 1; i < prices.length; i++) {
      // calcolo sottoproblema i
      int max = -1;

      for (int j = 0; j < i; j++) {
        // System.out.print(j + " " + (i-j-1) + "---");
        int currPrice = prices[j] + dp[i - j - 1];
        if (currPrice > max)
          max = currPrice;
        // System.out.print(prices[j] + dp[i - j - 1] + " ");
      }

      if (prices[i] > max)
        max = prices[i];
      dp[i] = max;

    }

    return dp[prices.length -1];
  }

  public static void stampaVett(int v[]) {
    System.out.print("\n[");
    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + ", ");
    }
    System.out.print("\b\b]\n");
  }

}

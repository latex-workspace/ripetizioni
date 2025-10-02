/**
 * Solution
 */
public class Solution {
  public static void main(String[] args) {
    (new Solution()).solution(4, 15, new int[] { 1, 2, 3, 5, 2, 6, 7, 2, 3, 4, 6, 1, 9, 3, 2, 1 });
    (new Solution()).solution(4, 15, new int[] { 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4 });
    (new Solution()).solution(4, 15, new int[] { 1, 2, 3, 4 });
  }

  // questa soluzione ritorna il valore massimo che si può ottenere
  /*
   * public void solution(int k, int b, int prices[]) {
   * 
   * int sum = 0;// salva la somma dei k elementi che terminano in i
   * int bestValue = 0;// salva la migliore somma trovata fino ad ora, sempre che
   * sia minore di b
   * 
   * int i = 0;
   * while (i < k) {
   * sum += prices[i];
   * i++;
   * }
   * 
   * while (i < prices.length) {
   * 
   * bestValue = (sum <= b && sum > bestValue) ? sum : bestValue;
   * sum -= prices[i - k];
   * sum += prices[i];
   * i++;
   * 
   * }
   * 
   * bestValue = (sum <= b && sum > bestValue) ? sum : bestValue;
   * 
   * if (bestValue == 0) {
   * System.out.
   * println("Errore, non ho intervalli con costo sufficientemente basso");
   * } else
   * System.out.println(bestValue);
   * }
   */

  // questa soluzione stampa l'indice di inizio e di fine nel quale è presente il
  // range con il presso maggiore

  public void solution(int k, int b, int prices[]) {
    
    int sum = 0;// salva la somma dei k elementi che terminano in i
    int bestValue = 0;// salva la migliore somma trovata fino ad ora, sempre che sia minore di b
    int startIndex = 0;
    int endIndex = 0;
    
    int i = 0;
    while (i < k) {
    sum += prices[i];
    i++;
    }
    
    while (i < prices.length) {
    
    if (sum <= b && sum > bestValue) {
    bestValue = sum;
    endIndex = i;
    startIndex = i - k;
    }
    
    sum -= prices[i - k];
    sum += prices[i];
    i++;
    
    }
    
    // per l'ultimo range calcolo separatamente per evitare indici negativi
    if (sum <= b && sum > bestValue) {
    bestValue = sum;
    endIndex = i;
    startIndex = i - k;
    }
    
    // se bestValue non è stato aggiornato è perchè non ho intervalli con costo
    // sufficientemente basso
    if (bestValue == 0)
    System.out.
    println("Errore, non ho intervalli con costo sufficientemente basso");
    else
    System.out.println("Valore massimo nel range: [" + startIndex + ", " +
    endIndex + ") con valore " + bestValue);
    }
}

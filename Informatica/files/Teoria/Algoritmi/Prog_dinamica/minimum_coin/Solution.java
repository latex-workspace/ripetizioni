/**
 * Solution
 */
public class Solution {


  public int coinChange(int[] coins, int amount) {

    int dp[] = new int[amount + 1];
    dp[0] = 0;

    for (int i = 1; i <= amount; i++) {
      int minVal = -1;

      for (int j = 0; j < coins.length; j++) {

        if (coins[j] <= i) {

          if (dp[i - coins[j]] != -1) {

            if (minVal == -1)
              minVal = 1 + dp[i - coins[j]];
            else
              minVal = Math.min(minVal, 1 + dp[i - coins[j]]);
          }
        }

      }

      dp[i] = minVal;
    }

    for (int i = 0; i < dp.length; i++) {
      System.out.print(dp[i] + " ");
    }

    System.out.println();

    return dp[amount];

  }

  public static void main(String[] args) {

    int amount = 24;
    int coins[] = { 9, 17 };

    System.out.println((new Solution()).coinChange(coins, amount));
  }

}

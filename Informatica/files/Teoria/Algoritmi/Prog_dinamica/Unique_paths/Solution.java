class Solution {








  public int uniquePaths(int m, int n) {
    int dp[][] = new int[m][n];

    for (int i = 0; i < m; i++)
      dp[i][0] = 1;

    for (int i = 0; i < n; i++)
      dp[0][i] = 1;

    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
        //stampa(dp, i, j);
      }
    }

    return dp[m - 1][n - 1];

  }






















  public void stampa(int mat[][], int m, int n) {
    System.out.println("\\begin{bmatrix}");
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (i == 0 || j == 0)
          System.out.print("1 & ");

        else if (i <= m && j <= n)
          System.out.print(mat[i][j] + " & ");
        else 
                  System.out.print(" / &");

      }
      System.out.print("\b\b\\\\\n");
    }
    System.out.println("\\end{bmatrix}");
  }

  public static void main(String[] args) {
    (new Solution()).uniquePaths(3, 7);
  }
}

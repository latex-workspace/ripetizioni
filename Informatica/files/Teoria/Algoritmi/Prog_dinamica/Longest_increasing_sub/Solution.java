/**
 * Solution
 */
public class Solution {

  public static void main(String[] args) {
    int v[] = {1,3,5,7};
    System.out.println((new Solution()).findLengthOfLCIS(v));
  }

    public int findLengthOfLCIS(int[] nums) {

    int ans = 1;
    int sum = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i - 1] < nums[i])
        sum++;
      else {
        ans = Math.max(ans, sum);
        sum = 1;
      }

    }

    ans = Math.max(ans, sum);
    return ans;
  }

}

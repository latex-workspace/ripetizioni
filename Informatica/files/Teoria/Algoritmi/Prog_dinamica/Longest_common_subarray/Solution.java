/**
 * Solution
 */
public class Solution {
  public static void main(String[] args) {
    int nums1[] = { 1, 3, 5, 8, 12, 19, 23, 25, 30 };
    int nums2[] = { 2, 4, 5, 8, 10, 12, 19, 23, 27 };
    System.out.println((new Solution()).longestSubarray(nums1, nums2));
  }

  public int longestSubarray(int nums1[], int nums2[]) {
    int max = 0;
    int i = 0, j = 0;
    int sum = 0;

    while (i < nums1.length && j < nums2.length) {

      if (nums1[i] != nums2[j]) {
        sum = 0;
        if (nums1[i] < nums2[j]) {
          i++;
        }

        else if (nums2[j] < nums1[i])
          j++;
      }

      else {
        sum++;
        max = Math.max(sum, max);
        i++;
        j++;
      }
    }

    return max;
  }

}

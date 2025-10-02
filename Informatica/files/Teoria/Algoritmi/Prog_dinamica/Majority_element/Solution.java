import java.util.HashMap;
import java.util.Map;

class Solution {

  /* O(n), O(1)
   * public int majorityElement(int[] nums) {
   * int n = nums.length;
   * HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
   * 
   * for (int i = 0; i < n; i++) {
   * map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
   * }
   * 
   * n = n / 2;
   * for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
   * if (entry.getValue() > n) {
   * return entry.getKey();
   * }
   * }
   * 
   * return 0;
   * }
   * 
   * public int majorityElement(int[] nums) {
   * 
   * for (int i = 0; i < nums.length; i++) {
   * if (contaRipetizioni(nums[i], nums) > nums.length / 2)
   * return nums[i];
   * }
   * 
   * return -1;
   * 
   * }
   * 
   * public static int contaRipetizioni(int n, int v[]) {
   * int count = 0;
   * for (int i = 0; i < v.length; i++) {
   * if (v[i] == n)
   * count++;
   * }
   * 
   * return count;
   * }
   */

  // soluzione avanzata O(n), O(1)
  /*
  public int majorityElement(int[] nums) {
    int ele = nums[0];
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (count == 0)
        ele = nums[i];
      count += (ele == nums[i]) ? 1 : -1;
    }
    return ele;

  }
  */

}

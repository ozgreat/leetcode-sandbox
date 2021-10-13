class Solution {
  public int dominantIndex(int[] nums) {
    int max = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[max] < nums[i]) {
        max = i;
      }
    }

    if (nums[max] == 1 && max == 0) {
      return 0;
    }

    for (int n : nums) {
      if (nums[max] < n * 2 && nums[max] != n) {
        return -1;
      }
    }

    return max;
  }
}
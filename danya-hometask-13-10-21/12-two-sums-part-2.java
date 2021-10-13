class Solution {
  public int[] twoSum(int[] numbers, int target) {
    int[] res = new int[2];
    int leftP = 0;
    int rightP = numbers.length - 1;

    while (leftP != rightP) {
      int sum = numbers[leftP] + numbers[rightP];
      if (sum == target) {
        res[0] = leftP + 1;
        res[1] = rightP + 1;
        break;
      } else if (sum < target) {
        ++leftP;
      } else {
        --rightP;
      }
    }

    return res;
  }
}
class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < numRows; ++i) {
      List<Integer> list = new ArrayList<>();
      res.add(list);
      for (int j = 0; j < i + 1; ++j) {
        if (j == 0 || j == i) {
          list.add(1);
        } else {
          List<Integer> prev = res.get(i-1);
          list.add(prev.get(j) + prev.get(j - 1));
        }
      }
    }

    return res;
  }
}
import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> res = new ArrayList<>();
    List<Integer> prev = new ArrayList<>();
    for (int i = 0; i <= rowIndex; ++i) {
      res = new ArrayList<>();
      for (int j = 0; j < i + 1; ++j) {
        if (j == 0 || j == i) {
          res.add(1);
        } else {
          res.add(prev.get(j) + prev.get(j - 1));
        }
      }
      prev = res;
    }

    return res;
  }
}
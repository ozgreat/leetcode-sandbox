class Solution {
  public String reverseWords(String s) {
    String[] arr = s.split(" ");

    StringBuilder sb = new StringBuilder();
    for (int i = arr.length - 1; i >= 0; --i) {
      if (!arr[i].isBlank()) {
        sb
            .append(arr[i])
            .append(" ");
      }
    }

    return sb.deleteCharAt(sb.length()-1).toString();
  }
}
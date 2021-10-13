class Solution {
  public void reverseString(char[] s) {
    int half = s.length / 2;
    int last = s.length - 1;
    char buf;
    for(int i = 0 ; i < half ; ++i){
      buf = s[i];
      s[i] = s[last-i];
      s[last-i]=buf;
    }
  }
}
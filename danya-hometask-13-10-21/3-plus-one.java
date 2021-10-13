class Solution {
  public int[] plusOne(int[] digits) {
    for(int i = digits.length - 1; i >= 0 ; --i){
      digits[i] = (digits[i]+1) % 10;
      if(digits[i] % 10 != 0){
        break;
      }
    }
    if(digits[0] == 0){
      int[] newDigits = new int[digits.length + 1];
      newDigits[0] = 1;
      for(int i = 0; i < digits.length ; ++i){
        newDigits[i+1] = digits[0];
      }
      digits = newDigits;
    }
    return digits;
  }
}
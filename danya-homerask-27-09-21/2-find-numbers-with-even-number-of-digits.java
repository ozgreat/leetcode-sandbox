class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        
        for(int i: nums) {
            int digits = 0;
            do {
                digits++;
                i /= 10;
            } while (i != 0);
            
            if (digits % 2 == 0){
                even++;
            }
        }
        
        return even;
    }
}

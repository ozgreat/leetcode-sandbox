class Solution {
    public int removeElement(int[] nums, int val) {
        int arrayEnd = nums.length - 1;
        int valCount = 0;
        
        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == val){
                valCount++;
            }
        }
        
        for(int i = 0; i < arrayEnd; ++i) {
            if(nums[i] == val){
                nums[i] = nums[arrayEnd];
                arrayEnd--;
                i--;
            }
        }
        
        return nums.length-valCount;
    }
}

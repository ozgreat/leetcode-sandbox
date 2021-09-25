class Solution {
    public void moveZeroes(int[] nums) {
        int pointer = 0;
        int zeroCount = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                zeroCount++;
            } else {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        for(int i = nums.length - zeroCount; i < nums.length; ++i){
            nums[i] = 0;
        }
    }
}

class Solution {

    public int[] sortArrayByParity(int[] nums) {
        int evenP = 0;

        for(int i = 0; i < nums.length; ++i) {
            int buf = nums[i];
            if(nums[i] % 2 == 0) {
                nums[i] = nums[evenP];
                nums[evenP] = buf;
                evenP++;
            }
        }

        return nums;
    }
}

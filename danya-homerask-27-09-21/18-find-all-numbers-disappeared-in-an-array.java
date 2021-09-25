class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        for (int i = 1; i <= nums.length; ++i){
            res.add(i);
        }
        
        for (int num: nums) {
            res.set(num-1, 0);
        }
        
        for(int i = res.size() - 1; i >=0; --i) {
            if(res.get(i) == 0) {
                res.remove(i);
            }
        }
        
        return res;
    }
}

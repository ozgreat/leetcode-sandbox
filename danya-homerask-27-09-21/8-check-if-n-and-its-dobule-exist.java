class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length; ++i){
            map.put(arr[i]*2, i);
        }
        
        for(int i = 0 ; i < arr.length; ++i) {
            Integer cur = map.get(arr[i]);
            if(cur != null && cur != i){
                return true;
            }
        }
        
        
        return false;
    }
}

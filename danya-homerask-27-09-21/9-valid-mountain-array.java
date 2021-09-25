class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        
        int maxI = 0;
        
        for (int i = 0; i < arr.length; ++i) {
            if(arr[maxI] < arr[i]){
                maxI = i;
            }
        }
        
        if(maxI == 0 || maxI == arr.length - 1){
            return false;
        }
        
        //Check increase;
        for (int i = 0; i < maxI - 1; ++i){
            if(arr[i] >= arr[i+1]) {
                return false;
            }
        }
        
        //Check decrease
        for (int i = maxI; i < arr.length - 1; ++i) {
            if (arr[i] <= arr[i+1]) {
                return false;
            }
        }
        
        return true;
    }
}

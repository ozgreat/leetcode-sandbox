class Solution {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 0){
            return arr;
        }
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0 ; --i) {
            int curMax = max;
            if (arr[i] > max) {
                max = arr[i];
            }
            arr[i] = curMax;
        }
        
        return arr;
    }
}

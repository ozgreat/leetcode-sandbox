class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int unexpected = 0;
        
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i]) {
                unexpected++;
            }
        }
        
        return unexpected;
    }
}

class Solution {
    public int thirdMax2(int[] nums) { // Выглядит лучше, но дольше
        Set<Integer> maxes = new HashSet<>();
        
        for(int number: nums) {
            maxes.add(number);
            if(maxes.size() > 3) {
                maxes.remove(Collections.min(maxes));
            }
        }
        
        if(maxes.size() == 3) {
            return Collections.min(maxes);
        } else {
            return Collections.max(maxes);
        }
    }
    
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null;

        for (int n : nums) {
            if(first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if ( n < first && (second == null || n > second)) {
                third = second;
                second = n;
            } else if (second != null && n < second && (third == null || n > third)) {
                third = n;
            }

        }

        if (nums.length < 3 || third == null) {
            return first;
        } else {
            return third;
        }
    }
}

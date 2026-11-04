class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i<nums.length; i+=2) {
            int f = nums[i];
            int s = nums[i+1];
            if (s <= 9) {
                f*=10;
            } else if (s <= 99) {
                f*=100;
            } else if (s <= 999) {
                f*=1000;
            } else {
                f*=10000;
            }
            int currSum = f+s;
            min = Math.min(currSum,min);


        }
        return min;

    }
}
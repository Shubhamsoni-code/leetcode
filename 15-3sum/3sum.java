class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int a = 0;
        while (a<nums.length-2) {
            int i = a+1, j = nums.length-1, target = -nums[a];
            while (i<j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                ans.add(Arrays.asList(nums[a], nums[i], nums[j]));
                i++;
                j--;
            
            
            while (i<j && nums[i] == nums[i-1]) {
                i++;
            }
            while (i< j && nums[j] == nums[j+1]) {
                j--;
            } }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
             }
            a++;
            while (a<nums.length-2 && nums[a] == nums[a-1]) {
                a++;
            }

        }
        return ans;

    }
}
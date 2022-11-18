class Solution {
    public int[] runningSum(int[] nums) {
        if(nums.length == 1) {return nums;}
        int[] sol = new int[nums.length];
        sol[0] = nums[0];
        for(int i = 1; i < sol.length; i++) {
            sol[i] = sol[i-1] + nums[i];
        }
        return sol;
    }
}
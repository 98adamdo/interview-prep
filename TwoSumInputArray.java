class TwoSumInputArray {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        int left = 0, right = nums.length - 1;
        while (nums[left] + nums[right] != target) {
            if(nums[left] + nums[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
        sol[0] = left+1;
        sol[1] = right+1;
        return sol;
    }
}
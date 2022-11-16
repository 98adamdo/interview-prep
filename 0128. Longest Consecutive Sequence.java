import java.util.Arrays;
class Solution {
    public int longestConsecutive(int[] nums) {
        int max = -1;
        if(nums.length == 0) {return 0;}
        if(nums.length == 1) {return 1;}
        Arrays.sort(nums);
        int[] sol = new int[nums.length];
        sol[0] = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1] + 1) {
                sol[i] = sol[i-1] + 1;
            }
            else if(nums[i] == nums[i-1]) {
                sol[i] = sol[i-1];
            }
            else {
                sol[i] = 1;
            }
            max = Math.max(max, sol[i]);
        }
        return max;
    }
}
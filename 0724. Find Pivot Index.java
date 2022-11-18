import java.util.HashMap;
class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 0) { return -1; }
        int right = 0, left = 0;
        for(int i = 0; i < nums.length; i++) {
            right += nums[i];
        }
        for(int j = 0; j < nums.length; j++) {
            right -= nums[j];
            if(left == right){
                return j;
            }
            left += nums[j];
        }
        return -1;
    }
}
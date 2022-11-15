import java.util.HashSet;
class Solution {
    public int singleNumber(int[] nums) {
        int sol = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(!hs.contains(nums[i])){
                hs.add(nums[i]);
                sol+=nums[i];
            }
            else{
                sol-=nums[i];
            }
        }
        return sol;
    }  
}
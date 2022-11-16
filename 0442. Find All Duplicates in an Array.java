import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> sol = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!hm.containsKey(nums[i])) {
                hm.put(nums[i], 1);
            }
            else {
                sol.add(nums[i]);
            }
        }
        return sol;
    }
}
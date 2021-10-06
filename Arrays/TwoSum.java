import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/two-sum/solution/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0 ; i<nums.length; i++){
            if(indices.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = indices.get(target-nums[i]);
            }
            indices.put(nums[i],i);
        }
        return res;
    }
}
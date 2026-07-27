import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Key = Number Value, Value = Array Index
        Map<Integer, Integer> seen = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement is already in the map, we found our pair
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }
            
            // Otherwise, store the current number and its index
            seen.put(nums[i], i);
        }
        
        // Per LeetCode constraints, a solution always exists.
        // This return statement satisfies the compiler.
        return new int[] {};
    }
}

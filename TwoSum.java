import java.util.HashMap;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // If complement exists in the hashmap, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Otherwise, store the current number and its index
            map.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[] {};
            
    }
        
    
}

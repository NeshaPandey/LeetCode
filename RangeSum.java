//LeetCode: https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/?envType=daily-question&envId=2024-08-04

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RangeSum {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        int MOD = 1_000_000_007;
        // Generate all subarray sums
        List<Integer> subarraySums = new ArrayList <>();
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                subarraySums.add(currentSum);
            }
        }
        
        // Sort the subarray sums
        Collections.sort(subarraySums);
        
        // Calculate the sum from index left to right (1-based)
        long result = 0;
        for (int i = left - 1; i < right; i++) {
            result = (result + subarraySums.get(i)) % MOD;
        }
        
        return (int) result;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int n = 4;
        int left = 1;
        int right = 5;
        System.out.println(rangeSum(nums, n, left, right)); // Output: 13
    }
}


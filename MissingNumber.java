//LeetCode Problem
//https://leetcode.com/problems/missing-number/submissions/1337136572/

public class MissingNumber {
    public int Solution(int[] nums){
        int n=nums.length;
        int ESum=n*(n+1)/2;
        int ASum=0;
        for(int num:nums){
            ASum+=num;
        }
        return (ESum-ASum);
    }
    public static void main(String[] args) {
        MissingNumber obj=new MissingNumber();
        int[] nums={1,0,3};
        System.out.println(obj.Solution(nums));
    }
}

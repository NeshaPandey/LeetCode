public class BinarySearch {
    public int search(int[] nums, int target) {
        
        int l = 0, h= nums.length-1;
        int mid= 0;
        while(l<=h){
            mid= l+(h-l)/2;
            if(nums[mid]==target)
                return mid;
            if(target<nums[mid])
                h = mid-1;
            else
                l = mid+1;
        }
        return -1;
    }
}
    

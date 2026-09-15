class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid+1]&&nums[mid]!=nums[mid-1]) return nums[mid];
            int f=mid;
            int s=mid;
            if(nums[mid]==nums[mid-1]) f=mid-1;
            if(nums[mid]==nums[mid+1]) s=mid+1;
            int left_length=f-low;
            int right_length=high-s;
             if(left_length % 2 == 1) {
                high = f-1; 
            }
            else {
                low = s+1;
            }
        }
        return 0;
    }
}
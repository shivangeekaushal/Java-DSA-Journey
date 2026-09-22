class Solution {
    public int[] sortedSquares(int[] nums) {
        int p=0;
        int q=nums.length-1;
        int []ans = new int [nums.length];
        int k=nums.length-1;
        while(p<=q){
            if(nums[p]*nums[p]>nums[q]*nums[q]) {
                ans[k]=nums[p]*nums[p];
                p++;
            }
            else{
                ans[k]=nums[q]*nums[q];
                q--;
            }
            k--;
        }
        return ans;
    }
}
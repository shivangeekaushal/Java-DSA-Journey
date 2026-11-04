class Solution {
    public void moveZeroes(int[] nums) {
        // int i=0; 
        // int j=nums.length-1;
        // while(i<j){
        //     if(nums[i])
        // }
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0) count++;
        }
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0) {
                nums[k]=nums[i];
                k++;
            }
        }
        // while(count>=0){
        //     nums[k]=0;
        //     count--;
        // }
        for(int i=count;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
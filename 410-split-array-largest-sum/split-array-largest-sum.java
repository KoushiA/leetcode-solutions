class Solution {
    int reqSubarray(int[] nums, int val){
      int curr=0;
      int sub=1;
      for(int i=0;i<nums.length;i++){
        if(curr+nums[i]<=val){
        curr=curr+nums[i];
      }
      else{
        curr=nums[i];
        sub++;
      }
      }
      return sub;
    }
    public int splitArray(int[] nums, int k) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int x:nums){
            high=high+x;
            if(x>low){
            low=x;
            }
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            int subarray=reqSubarray(nums,mid);
            if(subarray>k){
                low=mid+1;
            }
            else {
               high=mid-1;
            }
        }
        return low;
    }
}
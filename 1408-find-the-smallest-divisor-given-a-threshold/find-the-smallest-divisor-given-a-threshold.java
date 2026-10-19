class Solution {
    int check(int[] nums,int div){
          int sum=0;
        for(int i=0;i<nums.length;i++){
        int division=(int)Math.ceil((double)nums[i]/div);
        sum=sum+division;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>high){
            high=nums[i];
            }
        }
        while(low<high){
            int mid=low+(high-low)/2;
            int result=check(nums,mid);
            if(result<=threshold){
                high=mid;
            }
            else
            low=mid+1;
        }
        return low;
    }
}
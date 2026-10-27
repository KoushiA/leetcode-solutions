class Solution {
    public void reverseArr(int[] nums,int start, int end){
    while(start<end){
       int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
        start++;
        end--;
    }
    }
    public void rotate(int[] nums, int k) {
        int n=k%nums.length;
        if(n==0)
        return;
        //reversing the whole array
        reverseArr(nums,0,nums.length-1);
        // reverse the first half
        reverseArr(nums,0,n-1);
        //reverse the remaining;
        reverseArr(nums,n,nums.length-1);
    }
}
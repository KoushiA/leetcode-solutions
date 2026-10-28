class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int arrSum=0;
        for(int i=0;i<nums.length;i++){
        arrSum+=nums[i];
        }
        int totalSum=n*(n+1)/2;
        int missing=totalSum-arrSum;
        return missing;
    }
}
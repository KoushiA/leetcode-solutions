class Solution {
    public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    if(nums[0]!=0)
    return 0;
    int i=1;
    while(i<nums.length){
        if(nums[i]!=i){
            return i;
        }
        else i++;
    }
    return i ;
    }
}
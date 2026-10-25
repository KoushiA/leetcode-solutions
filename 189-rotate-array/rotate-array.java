class Solution {
    public void rotate(int[] nums, int k) {
        int[] res= new int[nums.length];
        int j=0;
        int n=k%nums.length;
        for(int i=0;i<nums.length;i++){
          if(n==nums.length){
                res[j]=nums[i];
                j++;
            }
          else{ 
             res[n]=nums[i];
            n++;
          }
        }
   for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }
}
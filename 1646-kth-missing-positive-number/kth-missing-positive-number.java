class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int i=0;
        for(int j=0;j<arr.length;j++){
            i++;
            while(i<arr[j]){
                count++;
                if(count==k){
                    return i;
                }
                i++;
            }
        }
        return arr[arr.length-1]+(k-count);
            }
}
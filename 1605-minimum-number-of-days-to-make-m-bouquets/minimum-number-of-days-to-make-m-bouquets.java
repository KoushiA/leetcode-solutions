class Solution {
    boolean canDo(int[] bloomDay,int day,int k, int m){
    int count=0;
    int bouquet=0;
    for(int i=0;i<bloomDay.length;i++){
        if(bloomDay[i]<=day){
            count++;
        }
        else
        count=0;
        if(count==k){
            bouquet++;
            count=0;
        }
        if(bouquet==m)
        return true;
    }
    return false;  
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE;
        int high=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<low)
            low=bloomDay[i];
            if(bloomDay[i]>high)
            high=bloomDay[i];
        }
        if(((long)m*k)>bloomDay.length)
        return -1;
        while(low<=high){
        int day=low+(high-low)/2;
        boolean done=canDo(bloomDay,day,k,m);
        if(done==true){
            high=day-1;
        }
        else
        low=day+1;
        }
        return low;
    }
}
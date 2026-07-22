class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int pile:piles){
            max = Math.max(max,pile);
        }
        int low = 1;
        int high = max;
        int ans = max;
        while(low<=high){
            int mid = (low+high)/2;
            long totalH = totalHours(piles,mid);
            if(totalH<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    long totalHours(int[] piles,int speed){
        long totalH = 0;
        for(int pile:piles){
            totalH += (int)Math.ceil((double)pile/speed);
        }
        return totalH;
    }
}
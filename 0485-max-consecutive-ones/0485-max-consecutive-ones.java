class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int i = 0;
        int count = 0;
        int maxCount = 0;
        while(i<n){
            if(nums[i] == 1){
                count++;
            }else{
                maxCount = Math.max(maxCount,count);
                count = 0;
            }
            i++;
        }
        return Math.max(maxCount,count);
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
        }
        int sumOfN = (n*(n+1))/2;
        int missNum = sumOfN - sum;
        return missNum;
    }
}
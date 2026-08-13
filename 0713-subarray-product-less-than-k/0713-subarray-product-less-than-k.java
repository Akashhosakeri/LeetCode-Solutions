class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int count = 0;
        int prod = 1;
        while(right < n){
            prod *= nums[right];
            while(prod >= k && left<=right){
                prod /= nums[left];
                left++;
            }
            count += right-left+1;
            right++;
        }
        return count;
    }
}
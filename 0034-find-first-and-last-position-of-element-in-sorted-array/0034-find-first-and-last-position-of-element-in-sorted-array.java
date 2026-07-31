class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, target);
        int last = lastOccurrence(nums, target);

        return new int[]{first, last};
    }

    static int firstOccurrence(int []nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        if(n==0 ) return -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                ans = mid;
                high = mid-1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int []nums,int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        if(n==0 ) return -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                ans = mid;
                low = mid+1;
            }else if(nums[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}

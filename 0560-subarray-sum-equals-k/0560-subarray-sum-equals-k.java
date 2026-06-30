class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int prefixSum = 0;
        int cnt = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefixSum += nums[i];
            int rem = prefixSum - k;
            if(map.containsKey(rem)){
                cnt += map.get(rem);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return cnt;
    }
}
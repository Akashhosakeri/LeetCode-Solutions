class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 1;
        int cnt = 0;
        Set<Integer>st = new HashSet<>();
        if(n==0) return 0;
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for(int it:st){
            if(!st.contains(it-1)){
                cnt = 1;
                int x = it;
                while(st.contains(x+1)){
                    x = x+1;
                    cnt = cnt + 1;
                }
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }
}
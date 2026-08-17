class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int total = 0;

        for (int freq : map.values()) {

            if (freq > maxFreq) {
                maxFreq = freq;
                total = freq;
            } 
            else if (freq == maxFreq) {
                total += freq;
            }
        }

        return total;
    }
}
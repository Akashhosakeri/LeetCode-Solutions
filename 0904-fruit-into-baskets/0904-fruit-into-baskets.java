class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0;
        int right = 0;
        int maxlen = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(right < n){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
            if(map.size() > 2){
                map.put(fruits[left],map.getOrDefault(fruits[left],0)-1);
                if(map.get(fruits[left]) == 0) map.remove(fruits[left]);
                left++;
            }
            if(map.size()<=2){
                maxlen = Math.max(right-left+1,maxlen);
            }
            right++;
        }
        return maxlen;
    }
}
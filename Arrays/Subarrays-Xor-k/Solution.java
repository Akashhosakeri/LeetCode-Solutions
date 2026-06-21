import java.util.HashMap;

public class Solution {
    public int countSubarrays(int[] arr, int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0, 1);
        int n = arr.length;
        int prefixXor = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            prefixXor ^= arr[i];
            int target = prefixXor^k;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prefixXor, map.getOrDefault(prefixXor,0)+1);
        }
        return count;
    }
}

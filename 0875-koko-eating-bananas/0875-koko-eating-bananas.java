class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        int low = 1;
        int high = max;
        int ans = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalHours = calcTotalHours(piles, mid);

            if (totalHours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private long calcTotalHours(int[] piles, int speed) {
        long totalH = 0;

        for (int bananas : piles) {
            totalH += (bananas + speed - 1L) / speed;
        }

        return totalH;
    }
}
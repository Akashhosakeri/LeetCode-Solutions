class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int costprice = prices[0];
        for(int i=1;i<n;i++){
            profit = Math.max(profit,prices[i]-costprice);
            costprice = Math.min(costprice,prices[i]);
        }
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        List<Integer> profit = new ArrayList<>();
        for(int i = 0 ; i < prices.length - 1 ; i++) {
            for( int j = i + 1 ; j < prices.length ; j++) {
                profit.add(prices[j] - prices[i]);
            }
        }
        return Collections.max(profit) < 0? 0: Collections.max(profit);
    }
}

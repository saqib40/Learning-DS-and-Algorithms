public class S6 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minimum = prices[0];
        int profit = 0;
        for(int i=1; i<n; i++) {
            int cost = prices[i]-minimum;
            profit = Math.max(cost,profit);
            minimum = Math.min(minimum,prices[i]);
        }
        return profit;
    }
}

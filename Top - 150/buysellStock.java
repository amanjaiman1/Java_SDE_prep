class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minIndex = 0;
        int min = prices[0];
        int res = 0;

            for(int i = 0; i< n-1; i++) {
                if(prices[minIndex] > prices[i]) {
                    minIndex = i;
                    min = prices[i];
                }
            }
            for(int j = minIndex; j < n; j++) {
                int x = prices[j] - min;
                res = Math.max(res, x);
            }

        return res;
    }
}

Time - O(n)
Testcases - 178/212

Optimized - 

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int min = prices[0];

        for(int i = 0; i< n; i++) {
            int cost = prices[i] - min;
            maxProfit = Math.max(maxProfit, cost);
            min = Math.min(min, prices[i]);
        }

        return maxProfit;
    }
}

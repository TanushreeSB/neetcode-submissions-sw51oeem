class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int maxP = 0;
        int minBuy = prices[0];

        for(int i=0;i<n;i++){
            maxP = max(maxP,prices[i] - minBuy);
            minBuy = min(minBuy,prices[i]);
        }
        return maxP;
    }
};

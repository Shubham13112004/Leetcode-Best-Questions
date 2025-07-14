    class Solution {
        public int maxProfit(int[] prices) {
            int buy=prices[0];
            int max_profit=0;

            for(int i=1;i<prices.length;i++){
                int current_profit=prices[i]-buy;
            //assigning current profit to max profit
                if(current_profit>max_profit){
                    max_profit=current_profit;
                }
                //we update buy to next bcz buy price is high
                if(prices[i]<buy){
                    buy=prices[i];
                }
            }
            return max_profit;

        }
    }

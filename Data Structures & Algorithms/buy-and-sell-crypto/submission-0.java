class Solution {
    public int maxProfit(int[] prices) {
       int buy = prices[0];
       int maxProfit = 0;
       int currProfit = 0;
       for(int i=0; i<prices.length;i++){
        if(prices[i] < buy){
            buy = prices[i];
        }
        else{
            currProfit = prices[i] - buy;
            if(currProfit > maxProfit){
                maxProfit = currProfit;
            }
        }
       }
       return maxProfit;
    }
}

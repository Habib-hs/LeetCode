class Solution {
    public int maxProfit(int[] prices) {
       // inspired by: https://www.youtube.com/watch?v=Q7v239y-Tik
       int maxProfit=0;
       for (int i=1; i<prices.length; i++){
        if (prices[i]>prices[i-1]) {
            maxProfit+=(prices[i]-prices[i-1]);
       }
       }
       return maxProfit; 
    }
}
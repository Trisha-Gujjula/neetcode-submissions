class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy= prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i] < buy){
                buy = prices[i];
            }else{
                int current = prices[i]-buy;
                if(current>max){
                    max = current;
                }
            }
        }
        return max ;
    }
}

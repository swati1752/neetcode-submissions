class Solution {// 10 8 7 2 9
    public int maxProfit(int[] prices) {
        int i=0, j=1;
        int maxPro = 0;
        while( j < prices.length){
            if( prices[i] < prices[j]){
                int pro = prices[j]-prices[i];
                maxPro = Math.max(maxPro,pro);
            }else {
                i = j;
            }
            j++;
        }
        return maxPro;
    }
}

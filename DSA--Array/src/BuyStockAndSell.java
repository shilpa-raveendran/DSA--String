public class BuyStockAndSell {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println("Profit is "+getStockBuyAndSell(nums));
    }
//BF
    public static int getStockBuyAndSell(int[] nums){
        int max= Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            int profit=0;
            for(int j = i+1 ; j < nums.length ; j++){
                profit= nums[j]-nums[i];
                max= Math.max(profit,max);
            }

        }
        return max;
    }
    //Optimal solution
   public static int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;
    }
}

public class BuyStockAndSell {
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        System.out.println("Profit is "+getStockBuyAndSell(nums));
    }

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
}

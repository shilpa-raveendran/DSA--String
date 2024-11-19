public class MaxSubArray {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Max Sum is "+maxSubArray_BF(nums));
    }
    //brute force
    //loop i and j as the starting and ending index of the subarray
    public static int maxSubArray_BF(int[] nums) {
        int max=Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length; i++){
            for(int j = i ; j <nums.length; j++){
                int sum=0;
                //for each subarray find sum
                for(int k = i; k <=j ; k++){
                    sum += nums[k];
                }
                max= Math.max(sum,max);
            }
        }
        return max;
    }
}

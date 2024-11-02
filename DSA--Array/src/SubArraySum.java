public class SubArraySum {
    public static void main(String[] args) {
        int[] nums ={1,1,1};
        int k =2;/// lengthOfLongestSubArray = 2; //totalNoOfSubarrays=2
        int lengthOfLongestSubArray= findLengthOfLongSubarray( nums,  k);
        System.out.println("The Length Of Longest Subarray:"+lengthOfLongestSubArray);

        int totalNoOfSubarrays= findTotalNoOfSubarrays( nums,  k);
        System.out.println("The Total No of Subarrays with K sum:"+totalNoOfSubarrays);
    }

    //LC: 560. Subarray Sum Equals K
    public static int findTotalNoOfSubarrays(int[] nums, int k) {
        //brute force
        int count=0;
        for(int i = 0 ; i < nums.length ; i++){
            int sum=0;
            for (int j = i+1 ; j < nums.length ; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }


    public static int findLengthOfLongSubarray(int[] nums, int k) {
        int res=0;
        for(int i = 0 ; i < nums.length ; i++){
            int count=0;
            int sum=0;
            for (int j = i ; j < nums.length ; j++){
                sum= sum + nums[j];
                if(sum == k){
                    count=j-i+1;
                }
            }
            res= Math.max(count,res);
        }
        return res;

    }
}

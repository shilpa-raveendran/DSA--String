public class SubArraySum {
    public static void main(String[] args) {
        int[] nums ={1,2,1,2,1};
        int k =3;/// lengthOfLongestSubArray = 2; //totalNoOfSubarrays=4
        int lengthOfLongestSubArray= findLengthOfLongSubarray( nums,  k);
        System.out.println("The Length Of Longest Subarray:"+lengthOfLongestSubArray);
    }

    public static int findTotalNoOfSubarrays(int[] nums, int k) {
        //brute force
        int res=0;
        //int count=0;
        for(int i = 0 ; i < nums.length ; i++){
            int count=0;
            int sum=nums[i];
            for (int j = i+1 ; j < nums.length ; j++){
                sum= sum + nums[j];
                if(sum == k){
                    count=j-i+1;

                }

            }
            res= Math.max(count,res);
        }
        return res;
    }

    public static int findLengthOfLongSubarray(int[] nums, int k) {

        return 0;
    }
}

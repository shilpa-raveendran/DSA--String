import java.util.HashMap;

public class SubArraySum {
    public static void main(String[] args) {
        int[] nums ={0,0,0,0,0,0,0,0,0,0};
        int k =0;/// lengthOfLongestSubArray = 10; //totalNoOfSubarrays=55
        int lengthOfLongestSubArray= findLengthOfLongSubArrayHashing( nums,  k);
        System.out.println("The Length Of Longest Subarray:"+lengthOfLongestSubArray);

        int totalNoOfSubarrays= findTotalNoOfSubArrayHashing( nums,  k);
        System.out.println("The Total No of Subarrays with K sum:"+totalNoOfSubarrays);
    }

    //LC: 560. Subarray Sum Equals K
    public static int findTotalNoOfSubArray(int[] nums, int k) {
        //brute force
        int count=0;
        for(int i = 0 ; i < nums.length ; i++){

            int sum=0;
            for (int j = i ; j < nums.length ; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int findTotalNoOfSubArrayHashing(int[] nums, int k){
        HashMap<Integer, Integer> map= new HashMap<Integer,Integer>();
        int count=0;
        int prefixSum=0;
        for(int i = 0 ; i < nums.length; i++){
            prefixSum += nums[i];

            if(prefixSum == k){
                count++;
            }

            int remainingSum= prefixSum-k;
            if(map.containsKey(remainingSum)){
                count = count+ map.get(remainingSum);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
    //Brtue Force
    public static int findLengthOfLongSubArray(int[] nums, int k) {
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
    public static int findLengthOfLongSubArrayHashing(int[] nums, int k) {
        //Declare a map to store the prefix sums and the indices.
        HashMap<Integer,Integer> map= new HashMap<>();
        int sum=0;
        int maxLength=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum ==k){
                maxLength=Math.max(maxLength,i+1);
            }
            int remainingSum= sum-k;
            if (map.containsKey(remainingSum)){
                int length= i-map.get(remainingSum);
                maxLength=Math.max(maxLength,length);
            }
            if (!map.containsKey(remainingSum)){
                map.put(sum,i);
            }
        }
        return maxLength;
    }
}

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums ={2,3,11,7,15};
        int target=9;
        int[] res=findTwoSumOptimalSol(nums,target);
        System.out.println("{"+res[0]+","+res[1]+"}");
    }
    //After sorting
    private static int[] findTwoSum1(int[] nums, int target) {
        int[] res={-1,-1};
        Arrays.sort(nums);
        int left =0;
        int right=nums.length-1;
        int sum=0;
        while(left<right){
            sum=nums[left] + nums[right];
            if(sum > target){
                right--;
            } else if (sum < target) {
                left++;
            }else{
                res[0]=left;
                res[1]=right;
                return res;
            }
        }
        return  res;
    }

    private static int[] findTwoSumOptimalSol(int[] nums, int target) {
        int[] res={-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                return res;
            }else{
                map.put(nums[i],i);
            }
        }
        return res;
    }

    //Brute force
    private static int[] findTwoSum(int[] nums, int target) {
        int[] res={-1,-1};
        for(int i =0 ; i < nums.length; i++){
            int sum=0;
            for(int j = i+1; j <nums.length; j++){
                sum= nums[i]+nums[j];
                if(sum == target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
}

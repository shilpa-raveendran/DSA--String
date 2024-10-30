import java.util.HashMap;
import java.util.Map;
//LC 136: Single number
public class SingleNumber {
    //Example 1:
    //Input: nums = [2,2,1]
    //Output: 1
    public static void main(String[] args) {
        int[] a ={4,1,2,1,2};
        //int res=findSingleNumber(a);
        int res=findSingleNumberHashMap(a);
        //int res=findSingleNumberXOR(a);
        System.out.println(res);
    }

    private static int findSingleNumber(int[] nums) {
        for(int i=0 ; i < nums.length ; i++){
            int count=0;
            for (int j = 0 ;j <  nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }
    //Better Solution
    private static int findSingleNumberHashMap(int[] nums){
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i],(map.getOrDefault(nums[i], 0)+1));
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet() ){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
    //Optimal Solution
    private static int findSingleNumberXOR(int[] a){
        int res=0;
        for (int i = 0; i < a.length; i++) {
            res= res ^ a[i];
        }
        return res;
    }
}

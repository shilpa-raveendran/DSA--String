import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    //LC 217. Contains Duplicate
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        //System.out.println(bruteforce(nums));
        System.out.println(optimalHashSet(nums));
    }

    private static boolean optimalHashSet(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    private static boolean optimalUsingHashMap(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i] , 0)+1);
        }
        for(Map.Entry<Integer,Integer> entries : map.entrySet()){
            if(entries.getValue() > 1){
                return true;
            }
        }
        return false;
    }

    private static boolean bruteforce(int[] nums) {
        for(int i = 0 ; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return  false;
    }
}

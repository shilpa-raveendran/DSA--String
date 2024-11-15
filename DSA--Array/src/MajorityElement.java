import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    //LC 169-Majority Element
    //The majority element is the element that appears more than ⌊n / 2⌋ times.
    // You may assume that the majority element always exists in the array.
    public static void main(String[] args) {
        int nums[] = {6,5,5};
        System.out.println("BF: "+majorityElement(nums));
        System.out.println("Using HashMap: "+majorityElementBetterSol(nums));
        System.out.println("Optimal Solution: "+majorityElementOptimalSol(nums));
    }

    //Using Hash Map
    private static int majorityElementBetterSol(int[] nums) {
        int N=nums.length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for (int i = 0; i < N; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for (Map.Entry<Integer,Integer> entries: hm.entrySet()){
            if(entries.getValue() > N/2){
                return entries.getKey();
            }
        }
        return 1;
    }

    //Moore's Voting Algorithm
    private static int majorityElementOptimalSol(int[] nums) {
        int N= nums.length;
        int element=0;
        int count=0;

        //Finding the majority element
        for (int i = 0; i < N; i++) {
            if (count == 0) {
                count = 1;
                element = nums[i];
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        //Verifying the majority element
        int count1=0;
        for (int i = 0; i < N; i++) {
            if(nums[i]==element){
                count1++;
            }
        }

        if (count1 > (N / 2)) return element;
        return 1;
    }


    //brute force
    public static int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count=1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count > nums.length/2){
                    return nums[i];
                }
            }
        }
    return 1;
    }
}

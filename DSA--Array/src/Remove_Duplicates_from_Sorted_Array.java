import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Remove_Duplicates_from_Sorted_Array {
    //LC: 26. Remove Duplicates from Sorted Array
    public static void main(String[] args) {
        int nums[]={-3,-1,0,0,0,3,3};
        System.out.println(removeDuplicates(nums));
    }

//    private static int removeDuplicates(int[] nums) {
    //Brute Force---> 
    //Time complexity: O(n*log(n))+O(n)
    //Space Complexity: O(n) 
    
//        TreeSet<Integer> set = new TreeSet<>();
//        for(int i = 0 ; i <= nums.length-1 ; i++){
//            set.add(nums[i]);
//        }
//        int size= set.size();
//        int j=0;
//        for(int i: set){
//            nums[j++]=i;
//        }
//        return size;
//    }
    //Optimal SOlution ( Two pointers)
    //Time Complexity: O(N)
    //Space Complexity: O(1)
    private static int removeDuplicates(int[] nums) {
        int i =0;
        for (int j = 1; j <= nums.length-1; j++) {
            if(nums[i] != nums[j]){
                nums[++i]=nums[j];
            }
        }
        return i+1;
    }
}

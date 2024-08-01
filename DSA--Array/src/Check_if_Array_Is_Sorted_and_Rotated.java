public class Check_if_Array_Is_Sorted_and_Rotated {
   // LC: 1752. Check if Array Is Sorted and Rotated
   public static void main(String[] args) {
       int nums[]={1,2,6,3,4,5};
       System.out.println(isSortedOptimal(nums));
   }

   //brute-force
    private static boolean isSorted_Bf(int[] nums) {
        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    return false;
                }
            }

        }
       return true;
    }

    //optimal-method
    private static boolean isSortedOptimal(int[] nums) {
        for (int i = 1; i <= nums.length-1; i++) {
                if(nums[i-1] > nums[i]){
                    return false;
                }
        }
        return true;
    }
}

public class Check_if_Array_Is_Sorted_and_Rotated {
   // LC: 1752. Check if Array Is Sorted and Rotated
   public static void main(String[] args) {
       int nums[]={1,2,6,3,4,5};
       System.out.println(isSortedOptimal(nums));
   }
   //Aproach
   //A sorted array that is rotated would have at most one "drop" or point where an element is greater than the next element.
   //Check Wrap Around: After the loop, check if the first element is less than the last element. If it is, increment count since this implies a "drop" from the end of the array to the start.
   //we need to check if there is at most one such "drop" point.
   
   //brute-force----> T.C= O(n^2)
    private static boolean isSorted_Bf(int[] nums) {
       int count=0;
        for (int i = 0; i <= nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                   count++;
                }
            }

        }
       if(nums[0] < nums[nums.length-1]){
            count++;
        }
        if(count <=1){
            return true;
        }
        return false;
    }

    //optimal-method----> T.C= O(n)
    private static boolean isSortedOptimal(int[] nums) {
       int count=0;
        for (int i = 1; i <= nums.length-1; i++) {
                if(nums[i-1] > nums[i]){
                    count++;
                }
        }
       if(nums[0] < nums[nums.length-1]){
            count++;
        }
        if(count <=1){
            return true;
        }
        return false;
    }
}

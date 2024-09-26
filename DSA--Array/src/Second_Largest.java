public class findSecondLargest {
   // GFG: Second Largest
  //Input: arr = [12, 35, 1, 10, 34, 1]
  //Output: 34
   public static void main(String[] args) {
       int nums[]={12, 35, 1, 10, 34, 1};
       System.out.println(getSecondLargest(nums));
   }

  //brute-force---> T.C O(nlogn)
  //Sort the array in ascending order
  //The element present at the second index from the end is the second largest element
  private static int getSecondLargest(int[] nums) {
    int arr_len=nums.length;
    Arrays.sort(nums);
    return nums[arr_len-2];
  } 

  
  //Better SOlution
  //TC--> O(n) 
  //Find the largest element in the array in a single traversal
  //After this, we once again traverse the array and find the largest element which is just smaller than 
  //the largest element we just found
    private static int getSecondLargest(int[] nums) {
        int largest=a[0];
        int sec_largest=-1;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i]> largest){
                largest=a[i];
            }
        }
        for(int i = 0 ; i < a.length ; i++){
             if(a[i]> sec_largest && a[i] < largest){
                sec_largest=a[i];
            }
        }
        return sec_largest;
    }

    //optimal-method
    // TC--> O(n) Single Pass Solution
    private static boolean isSortedOptimal(int[] nums) {
        int largest=a[0];
	      int second_large = -1;
  	    for(int i = 0 ; i < a.length; i++){
  	        if(a[i] > largest){
  	           second_large = largest;
  	           largest =a[i];
  	        }else if (a[i] > second_large && a[i] != largest){
  	            second_large=a[i];
  	        }
  	    }
        return second_large;
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums={3,0,1};
        //System.out.println(findMissingNumber_BF(nums));
        System.out.println(findMissingNumber2(nums));
    }

    private static int findMissingNumber_BF(int[] nums) {
        int N=nums.length;
        for (int i = 0; i <= N; i++) {

            // flag variable to check
            //if an element exists
            int flag = 0;

            //Search the element using linear search:
            for (int j = 0; j <= N - 1; j++) {
                if (nums[j] == i) {

                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }

            // check if the element is missing
            //i.e flag == 0:

            if (flag == 0) return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }
    //Better Solution-- >
    //Sum of first N numbers(S1) = (N*(N+1))/2
    //Sum of all array elements(S2)
    //missing no= S1-s2;
    public static int findMissingNumber1(int[] nums) {
        int n= nums.length;
        int s1= (n*(n+1))/2;
        int s2=0;
        for (int i = 0; i <=n-1 ; i++) {
            s2+=nums[i];
        }

        return s1-s2;
    }

    //Optimal Solution --> using XOR
    public static int findMissingNumber2(int[] nums) {
        int res=0;
        for (int i = 0; i <= nums.length; i++) {
            res = res ^ i;
        }
        for (int i = 0; i <= nums.length-1; i++) {
            res= res ^ nums[i];
        }
        return res;
    }
}

public class MaximumConsecutiveOnes {
    //LC 485:
//    Example 1:
//    Input:nums =[1,1,0,1,1,1]
//    Output:3
//    Explanation: The first two digits or the last three digits are consecutive 1s.
//    The maximum number of consecutive 1s is 3.

    public static void main(String[] args) {
        int[] a ={1,1,0,1,1,1};
        findMaxOnes(a);
    }

    private static void findMaxOnes(int[] a) {
        int count=0;
        int maxCount=0;
        for (int num : a) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(count, maxCount);
        }
        System.out.println("Max count: "+maxCount);
    }
}

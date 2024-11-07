public class SortColors {
    public static void main(String[] args) {
        int[] nums ={2,0,2,1,1,0};
        //Brute Force--> Arrays.sort(nums)->O(nlogn)
        sortColorsBetterSol(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static int[] sortColors(int[] nums) {
        return nums;
    }

    //Better sol;
    //Keep a count variable for 0s,1,s and 2s
    private static int[] sortColorsBetterSol(int[] nums) {
        int count1=0;
        int count2=0;
        int count0=0;
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        //Traverse through array once again to array according to count
        for (int i = 0; i < count0; i++) {
            nums[i]=0;
        }
        for (int i = count0; i < count0+count1; i++) {
            nums[i]=1;
        }
        for (int i = count0+count1; i < nums.length; i++) {
            nums[i]=2;
        }
        return nums;
    }
}

public class MoveZeroes {
// LC: 283. Move Zeroes
    public static void main(String[] args) {
        int nums[] = {0, 1, 0, 3, 12};
        //bruteForce(nums);
        optimalSol(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static void bruteForce(int[] nums) {
        int temp[] = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                temp[j] = nums[i];
                j++;
            }

        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
            System.out.print(nums[i] + " ");
        }
    }

    private static void optimalSol(int[] nums) {
        int j = 0;  // Pointer to track the position of the next non-zero element

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}

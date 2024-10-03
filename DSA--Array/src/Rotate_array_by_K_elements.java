public class RotateArrays {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        int k = 2;
        int n = nums.length;
        k = k % n;
        //rotateLeftArraysBF(nums, k, n);
        //rotateRightArraysBF(nums, k, n);
        ReversingLeft(nums,k,n);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    private static void rotateRightArraysBF(int[] nums, int k, int n) {
        int temp[] = new int[k];
        //Save last k elemts to temp
        for (int i = 0; i < k; i++) {
            temp[i]= nums[n-k+i];
        }
        //Right shift first n-k elements
        for (int i = k; i >=0 ; i--) {
            nums[i+k] = nums[i];
        }
        //Copy temp to the beginning of i/p
        for (int i = 0; i <k ; i++) {
                nums[i]= temp[i];
        }
    }

    //Brute force
    private static void rotateLeftArraysBF(int[] nums, int k, int n) {
        int temp[] = new int[k];
        //Save first k elements to temp array
        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }
        //Shift last n-k elements to left of i/p array
        for (int i = 0; i < n-k; i++) {
            nums[i] = nums[i+k];
        }
        //Copy temp to the back of i/p array
        for (int i =0; i < k; i++) {
            nums[n-k+i] = temp[i];
        }

    }

    private static void ReversingLeft(int[] nums, int k, int n) {
        //reversing first k elements i.e 0 to k-1==> {2,1}
        reverse(nums,0,k-1);

        //reversing from n-k to n-1 elements==>{5,4,3}
        reverse(nums,k,n-1);
        // At this point the i/p is {2,1,5,4,3}
        //now reversing entire arr==> {3,4,5,1,2}  which is the o/p
        reverse(nums,0,n-1);

    }
    private static void ReversingRight(int[] nums, int k, int n) {
        // Reverse first n-k elements
        reverse(nums, 0, n - k - 1);
        // Reverse last k elements
        reverse(nums, n - k, n - 1);
        // Reverse whole array
        reverse(nums, 0, n - 1);
    }
    private static void reverse(int[] nums, int start, int end){
        while(start< end){
            int temp= nums[start];
            nums[start]= nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}

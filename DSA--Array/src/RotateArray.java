public class RotateArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        System.out.println(rotateArrays(nums,k));
    }

    private static int rotateArrays(int[] nums,int k) {
        int temp[]= new int[k];
        int j=k;
        for(int i = nums.length-1; i>k ; i--){
            temp[j-1]=nums[i];
            j--;
        }
        return 0;
    }
}

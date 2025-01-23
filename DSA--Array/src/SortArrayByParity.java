import java.util.Arrays;

public class SortArrayByParity {
   //LC 905. Sort Array By Parity

   // Given an integer array nums,
    // move all the even integers at the beginning of the array
    // followed by all the odd integers.

    //Return any array that satisfies this condition.
    public static void main(String[] args) {
        int arr[]= {3,6,9, 2, 4 ,10 ,34, 21, 5};
        System.out.println(findMinMoves(arr));

    }

    private static int findMinMoves(int[] arr) {
        int left=0;
        int right= arr.length-1;
        int moves=0;
        while(left< right){
            if( arr[left] %2 ==0){
                left++;
                continue;
            }
            if( arr[right] %2 !=0){
                right--;
                continue;
            }
            int temp= arr[left];
            arr[left]= arr[right];
            arr[right] =temp;
            left++;
            right--;
            moves++;
        }

        return moves;
    }
}

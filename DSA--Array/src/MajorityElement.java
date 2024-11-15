public class MajorityElement {
    //LC 169-Majority Element
    //The majority element is the element that appears more than ⌊n / 2⌋ times.
    // You may assume that the majority element always exists in the array.
    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    //brute force
    public static int majorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count=1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
                if(count > nums.length/2){
                    return nums[i];
                }
            }
        }
    return 1;
    }
}

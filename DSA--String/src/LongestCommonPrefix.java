import java.util.Arrays;

public class LongestCommonPrefix {
    //Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
    //Output: "gee"
    //Explanation: "gee" is the longest common prefix in all the given strings.
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "geek", "geezer"};
        //String arr[] = {"hello", "world"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String arr[]) {
        // sort the arr and get the first and last strings
        Arrays.sort(arr);
        String first=arr[0];
        String last=arr[arr.length-1];

        int i= 0;
        int maxlength= first.length();
        while(i <  maxlength && first.charAt(i) ==last.charAt(i)){
            i++;
        }
        return last.substring(0,i);
    }
}

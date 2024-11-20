public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Welcome";
        String reversedString = reverseString(str);
        System.out.println(reversedString);

    }
    //Brute force
    private static String reverseString(String str) {
        String reversedString="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedString +=str.charAt(i);
        }
        return reversedString;
    }
}
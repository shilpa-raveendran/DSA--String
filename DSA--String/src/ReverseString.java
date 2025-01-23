public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello Welcome";
        String reversedString = reverseString(str);
        System.out.println(reversedString);
    }
    //Brute force
    private static String reverseString(String str) {

        StringBuilder reversedString= new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }
}
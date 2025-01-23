public class ReverseVowels {
    public static void main(String[] args) {
        String str = "hello world";
        betterSolution(str);
    }

    //using two pointers
    private static void betterSolution(String str) {
        int left= 0;
        int right = str.length()-1;
        char[] charArr= str.toCharArray();
        while(left < right){
            if(!isVowels(charArr[left])){
                left++;
                continue;
            }
            if(!isVowels(charArr[right])){
                right--;
                continue;
            }
            char temp= charArr[left];
            charArr[left]=str.charAt(right);
            charArr[right]=temp;
            left++;
            right--;
        }
        System.out.println(String.valueOf(charArr));
    }

    private static boolean isVowels(char c) {

          return   (c =='a' || c =='e' || c =='i'
                    ||c =='o'  || c =='u' ||
                    c =='A' || c =='E' || c =='I'
                    ||c =='O'  || c =='U');


    }

    public void bruteforceSol(String str){
        char[] charArr= str.toCharArray();
        char[] vowelArr= new char[charArr.length];
        //boolean isVowels= isVowels(str);
        int j =0;
        for (int i = 0; i < charArr.length; i++) {
            if(isVowels(charArr[i])){
                vowelArr[j++]=charArr[i];
            }
        }

        for (int i = 0; i < charArr.length; i++) {
            if(isVowels(str.charAt(i))){
                charArr[i] =vowelArr[--j];
            }
        }
        System.out.println(String.valueOf(charArr));
    }
}

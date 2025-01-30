import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {

    //Given two strings. The task is to check whether the given strings are anagrams of each other or not.
    // Do not use any sorting method.
    //An anagram of a string is another string that contains the same characters, only the order of characters can be different.
    // For example, “abcd” and “dabc” are an anagram of each other.
    public static void main(String[] args) {
        String input1="abc@Ad";
        String input2="Adabc@";
        //
        AnagramStrings an= new AnagramStrings();
        System.out.println(an.isAnagram_AnotherApproach(input1,input2));
    }
    //Using Hashmap--> TC O(m+n) depends on the length of two strings
    public boolean isAnagram(String input1, String input2){
        HashMap<Character, Integer> freqOfInput1= new HashMap<>();
        for (int i = 0; i < input1.length(); i++) {
            //key=a;1+1
            freqOfInput1.put(input1.charAt(i),freqOfInput1.getOrDefault(input1.charAt(i),0)+1);

        }
        for(int j = 0 ; j <input2.length(); j++){
            if(freqOfInput1.containsKey(input2.charAt(j))){
                //freqOfInput1. decrement the value
                freqOfInput1.put(input1.charAt(j),freqOfInput1.getOrDefault(input1.charAt(j),0)-1);
            }
        }
        //check in the HM whether the values are zero for each key if not - not anagram
        for (Map.Entry<Character,Integer> entries : freqOfInput1.entrySet()){
            if(entries.getValue() != 0){
                return false;
            }
        }
        return true;
    }
    //using freq_array if its all lowercase
    public boolean isAnagram_AnotherApproach(String input1, String input2){
        int freqArray[] = new int[256];
        for (int i = 0; i < input1.length(); i++) {
            freqArray[input1.charAt(i)-'0']++;
        }
        for (int i = 0; i < input2.length(); i++) {
            freqArray[input2.charAt(i)-'0']--;
        }

        for(Integer values : freqArray){
            if(values != 0){
                return false;
            }
        }
        return true;
    }
}



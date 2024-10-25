class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        //Brute Force 
      // Looping two arrays and adding to a  set ; 
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0 ; i < a.length; i++){
            set.add(a[i]);
        }
        
        for(int i = 0 ; i < b.length; i++){
            set.add(b[i]);
        }
      //Returing the result as an arrylist
       ArrayList<Integer> result= new ArrayList<>();
       for (Integer number : set) {
           result.add(number);
       }
       return result;
    }
}

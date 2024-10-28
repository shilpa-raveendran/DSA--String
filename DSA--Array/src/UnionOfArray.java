class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> result= new ArrayList<>();
        //Brute Force 
      // Looping two arrays and adding to a  set ; 
      //   TreeSet<Integer> set = new TreeSet<>();
      //   for(int i = 0 ; i < a.length; i++){
      //       set.add(a[i]);
      //   }
        
      //   for(int i = 0 ; i < b.length; i++){
      //       set.add(b[i]);
      //   }
      // //Returing the result as an arrylist
      //  
      //  for (Integer number : set) {
      //      result.add(number);
      //  }

    //Optimal Solution
         int i = 0, j = 0; // pointers
        int n=a.length; 
        int m= b.length;
  while (i < n && j < m) {
    if (a[i] <= b[j]) // Case 1 and 2
    {
      if (result.size() == 0 || result.get(result.size()-1) != a[i]){
        result.add(a[i]);
      }
      i++;
    } else // case 3
    {
      if (result.size() == 0 || result.get(result.size()-1) != b[j]){
        result.add(b[j]);
      }
      j++;
    }
  }
  while (i < n) // IF any element left in arr1
  {
    if (result.get(result.size()-1) != a[i]){
        result.add(a[i]);
    }
    i++;
  }
  while (j < m) // If any elements left in arr2
  {
    if (result.get(result.size()-1) != b[j]){
      result.add(b[j]);
    }
    j++;
  }
       return result;
    }
}

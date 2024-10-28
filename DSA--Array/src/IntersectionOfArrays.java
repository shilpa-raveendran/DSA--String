import java.util.ArrayList;

public class  IntersectionOfArrays {
    public static void main(String[] args) {
        int[] a={2,2,3,4};
        int[] b={1,2,2,3};
        findIntersection(a,b).forEach(s-> System.out.print(s+" "));
    }
    public static ArrayList<Integer> findIntersection(int a[], int b[]){
        ArrayList<Integer> result= new ArrayList<>();
        //brute force
        /*int visted[]=new int[b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j] && visted[j]==0){
                    result.add(a[i]);
                    visted[j]=1;
                    break;
                }else if(b[j] >a[i]){
                    break;
                }
            }
        }*/

        //Better solution-- Two pointers
        int i = 0; int j= 0;
        int n = a.length;
        int m = b.length;

        while(i < n && j <m){
            if(a[i] == b[j]){
                result.add(a[i]);
                i++;
                j++;
            }else if(a[i] < b[j]){
                i++;
            }else{
                j++;
            }
        }
        return result;
    }
}

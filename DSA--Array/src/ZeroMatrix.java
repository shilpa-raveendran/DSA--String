import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMatrix {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 0)));
                    //0th row, 1st , 2nd
        // 0th col     0, 0, O
        // 1st col     1, 0, 0
        // 2ns col     0, 0, 0
        //int i = row; int j = columns
        int row= matrix.size();
        int col = matrix.get(0).size();
        System.out.println("Row is m: "+row+ " || Col is n: "+col);

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, row, col);
        for (ArrayList<Integer> rows : ans) {
            for (Integer ele : rows) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(matrix.get(i).get(j) == 0){
                    setRow(matrix, i, j, row);
                    setCol(matrix, i, j, col);
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix.get(i).get(j) == -1) {
                    matrix.get(i).set(j,0);
                }
            }
        }
        return matrix;
    }

    private static void setRow(ArrayList<ArrayList<Integer>> matrix, int i,int j, int row) {
        for (int k = 0; k < row; k++) {
            if (matrix.get(i).get(k) != 0 ){
                matrix.get(i).set(k, -1);
            }
        }
    }

    private static void setCol(ArrayList<ArrayList<Integer>> matrix, int i,int j, int col) {
        for (int k = 0; k < col; k++) {
            if (matrix.get(k).get(j) != 0 ){
                matrix.get(k).set(j, -1);
            }
        }
    }
}

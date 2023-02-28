package leetcode;

/**
 * @author Damon
 * @version 1.0
 */
public class Q1 {
    public static void main(String[] args) {

    }
}
class Solution1 {
    public void setZeroes(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] == 0){
                    for(int q = 0; q < matrix.length; q++){
                        matrix[i][q] = 0;

                    }
                    for (int w = 0; w < matrix.length; w++){
                        matrix[w][j] = 0;
                    }

                }
            }
        }
    }
}
package leetcode;

/**
 * @author Damon
 * @version 1.0
 */
public class Interview_Q01_07 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                        {7,8,9}};
        Solution solution = new Solution();
        solution.rotate(arr);

    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int[][] newArr = new int[matrix.length][matrix.length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                newArr[i][j] = matrix[matrix.length-1-j][i];
            }
        }
        for (int i = 0; i< newArr.length; i++){
            for (int j = 0; j<newArr[i].length;j++){
                System.out.print(newArr[i][j]);
            }
            System.out.println();
        }
    }
}
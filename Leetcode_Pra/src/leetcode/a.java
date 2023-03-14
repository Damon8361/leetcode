package leetcode;

public class a {
    public static void main(String[] args) {



        char[][] test = {{'1','1','1','1','0'},
                         {'1','1','0','1','0'},
                         {'1','1','0','0','0'},
                         {'0','0','0','0','0'}};

        Solution00 solution00 = new Solution00();
        System.out.println(solution00.numIslands(test));
    }
}
//给你一个由，1’ (陆地)和，0 (水) 组成的的二维网格，请你计算网格中岛屿的数量岛屿总是被水包围，
// 并目每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成.
// 此外，你可以假设该网格的四条边均被水包围。
class Solution00{
    public int numIslands(char[][] grid){
        if (grid == null || grid.length == 0|| grid[0].length == 0){
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int numIsland = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1'){
                    numIsland++;
                    dfs(grid,i,j);
                }
            }
        }
        return numIsland;
    }

    public void dfs(char[][] grid, int i, int j){
        if (i < 0 || i>=grid.length || j < 0|| j >= grid[0].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        dfs(grid , i - 1 , j);
        dfs(grid , i + 1 , j);
        dfs(grid , i , j - 1);
        dfs(grid , i , j + 1);
    }

}
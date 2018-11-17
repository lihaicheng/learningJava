package leetcode.section9dp;

public class L64 {
    public static int minPathSum(int[][] grid) {
        int row = grid.length;
        if (row == 0)
        {
            return 0;
        }
        int col = grid[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = grid[0][0];
        for (int i = 1 ; i < row ; i++)
        {
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for (int j = 1 ; j < col ; j++)
        {
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        for (int i = 1 ; i < row ; i++)
        {
            for (int j = 1 ; j < col ; j++)
            {
                dp[i][j] = min(dp[i][j-1], dp[i-1][j]) + grid[i][j];
            }
        }
        return dp[row-1][col-1];
    }

    public static int min(int a , int b)
    {
        return a <= b ? a : b;
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int res = minPathSum(grid);
        System.out.print(res);
    }
}

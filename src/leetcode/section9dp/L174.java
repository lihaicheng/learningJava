package leetcode.section9dp;

public class L174 {
    public static int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        if (row == 0)
        {
            return 1;
        }
        int col = dungeon[0].length;
        int[][] dp = new int[row][col];

        dp[row - 1][col - 1] = max(1, 1-dungeon[row - 1][col - 1]);
        for (int j = col - 2 ; j >= 0 ; j--)
        {
            dp[row - 1][j] = max(1, dp[row - 1][j + 1] - dungeon[row - 1][j]);
        }
        for (int i = row - 2 ; i >= 0 ; i--)
        {
            dp[i][col - 1] = max(1, dp[i + 1][col - 1] - dungeon[i][col - 1]);
            for (int j = col - 2 ; j >= 0 ; j--)
            {
                dp[i][j] = max(1, min(dp[i + 1][j], dp[i][j + 1]) - dungeon[i][j]);
            }
        }

        return dp[0][0];
    }
    public static int neg(int num)
    {
        if (num < 0)
        {
            return num;
        }
        else
        {
            return 0;
        }
    }
    public static int max(int a , int b)
    {
        return a >= b ? a : b;
    }
    public static int min(int a , int b)
    {
        return a <= b ? a : b;
    }
    public static void main(String[] args) {
        int[][] dungeon = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
        int res = calculateMinimumHP(dungeon);
        System.out.print(res);
    }
}

package leetcode.section9dp;

public class L322 {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for (int i = 1 ; i <= amount ; i++)
        {
            dp[i] = -1;
        }
        for (int i = 1 ; i <= amount ; i++)
        {
            for (int j = 0 ; j < coins.length ; j++)
            {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != -1)
                {
                    //i - coins[j] >= 0? 金额可以用当前的币值找零
                    //dp[i - coins[j]] != -1?剩下的金额有找零策略
                    if (dp[i] == -1 || dp[i] > dp[i - coins[j]] + 1)
                    {
                        // dp[i] == -1?当前位置未做过判断
                        // dp[i] > dp[i - coins[j]] + 1？存在更优解
                        dp[i] = dp[i - coins[j]] + 1;
                    }
                }
            }
        }
        return dp[amount];
    }


    public static void main(String[] args) {
        int[] coins = {2};
        int amount = 3;
        //int res = coinChange(coins, amount);
        int aa = 4;
        float res = aa/amount;
        System.out.print(res);

    }
}

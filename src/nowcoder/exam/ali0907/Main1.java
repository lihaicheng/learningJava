package nowcoder.exam.ali0907;

import java.util.Scanner;

public class Main1 {
    public static int getResult(int n)
    {
        if (n == 0)
        {
            return 0;
        }
        if (n == 1)
        {
            return 1;
        }
        if (n == 2)
        {
            return 1;
        }
        if (n == 3)
        {
            return 3;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 3;
        for (int i = 4 ; i <= n ; i++)
        {
            dp[i] = dp[i-1] * 2/3
                    + dp[i-2]
                    + dp[i-3] * 2/3
                    + 2 * dp[i-3];
        }
        return dp[n];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = getResult(n);
        System.out.print(res);
    }
}

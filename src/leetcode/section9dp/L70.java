package leetcode.section9dp;

public class L70 {
    public static int climbStairs(int n) {
        int[] res = new int[n+3];
        res[1] = 1;
        res[2] = 2;
        for(int i = 3; i <= n ; i++)
        {
            res[i] = res[i-1] + res[i-2];
        }
        return res[n];

    }

    public static void main(String[] args) {
        int n = 3;
        int result = climbStairs(n);
        System.out.print(result);

    }
}

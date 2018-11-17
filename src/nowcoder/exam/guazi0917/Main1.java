package nowcoder.exam.guazi0917;

import java.util.Scanner;

public class Main1 {


    public static int[] coins = {1, 2, 5, 10};
    public static int getRes(int n)
    {
        int[] res = new int[2];
        res[1] = 3;
        resCore(n, res);
        return res[0];
    }
    public static void resCore(int n, int[] res)
    {
        if (n == 0)
        {
            res[0]++;
            return;
        }
        if (n < 0)
        {
            return;
        }
        resCore(n-coins[res[1]], res);
        res[1]--;
        if (res[1] >= 0)
        {
            resCore(n-coins[res[1]], res);
        }
        res[1]++;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = getRes(n);
        System.out.println(res);

    }
}

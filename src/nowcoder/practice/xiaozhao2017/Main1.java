package nowcoder.practice.xiaozhao2017;

import java.util.Scanner;

public class Main1 {
    public static int getRes(int[] a, int k, int d)
    {
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int d = sc.nextInt();
        int res = getRes(a, k, d);
        System.out.print(res);
    }
}

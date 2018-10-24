package nowcoder.exam.guazi0917;

import java.util.Scanner;

public class Main2 {

    public static int getRes(int n, int[] h, int maxh)
    {
        int res = 0;
        int temph = 0;
        int[] l = new int[n];
        int[] r = new int[n];
        l[0] = h[0];
        r[n-1] = h[n-1];
        for (int i = 1 ; i < n ; i++)
        {
            l[i] = (h[i] > l[i-1] ) ? h[i] : l[i-1];
        }
        for (int i = n - 2 ; i >= 0 ; i--)
        {
            r[i] = (h[i] > r[i+1] ) ? h[i] : r[i+1];
        }
        for (int i = 1 ; i <= maxh ; i++)
        {
            for (int j = 0 ; j < n ; j++)
            {
                if ((l[j] >= i) && (r[j] >= i) && (h[j] < i))
                {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int maxh = 0;
        int sum1 = 0;
        for (int i = 0 ; i < n ; i++)
        {
            h[i] = sc.nextInt();
            if (h[i] < 0)
            {
                sum1 -= h[i];
                h[i] = 0;
            }
            if (h[i] > maxh)
            {
                maxh = h[i];
            }
        }
        int sum2 = getRes(n, h, maxh);
        System.out.println(sum1+sum2);

    }
}
